
public class Clock {
  /**
   *  Class field definintions go here
   */
   private static final double DEFAULT_TIME_SLICE_IN_SECONDS = 60.0;
   private static final double INVALID_ARGUMENT_VALUE = -1.0;
   private static final double MAXIMUM_DEGREE_VALUE = 360.0;
   private static final double MAXIMUM_TIME_SLICE = 1800.0;
   private static final double HOUR_HAND_DEGREES_PER_SECOND = 0.00834;
   private static final double MINUTE_HAND_DEGREES_PER_SECOND = 0.1;
   private static final double SECONDS_IN_HOUR = 3600.0;
   private static final double SECONDS_IN_MINUTE = 60.0;
   private double seconds;
   private double minutes;
   private double hours;
   private double totalSeconds;
   private double timeSlice;
   private double minuteHandAngle;
   private double hourHandAngle;

  /**
   *  Constructor goes here
   */
   public Clock()
   {
     this.hour = 0.0;
     this.minute = 0.0;
     this.second = 0.0;
     this.totalSeconds = 0.0;
     this.timeSlice = DEFAULT_TIME_SLICE_IN_SECONDS;
     this.minuteHandAngle = 0.0;
     this.hourHandAngle = 0.0;

   }

  /**
   *  Methods go here
   *
   *  Method to calculate the next tick from the time increment
   *  @return double-precision value of the current clock tick
   */
   public double tick()
   {
      this.totalSeconds += this.timeSlice;

      this.hour = Math.floor( this.totalSeconds / SECONDS_IN_HOUR);
      this.minute = Math.floor( (this.totalSeconds - ( SECONDS_IN_HOUR * this.hour)) / SECONDS_IN_MINUTE);
      this.second = this.totalSeconds - ( SECONDS_IN_HOUR * this.hour) - ( SECONDS_IN_MINUTE * this.minute);

      return this.totalSeconds;
   }

  /**
   *  Method to validate the angle argument
   *  @param   argValue  String from the main programs args[0] input
   *  @return  double-precision value of the argument
   *  @throws  NumberFormatException
   */
   public double validateAngleArg( String argValue ) throws NumberFormatException
   {
      double this.angle = 0.0;

      try { this.angle = Double.parsreDouble( argValue ); }
      catch ( Exception e) { throw new NumberFormatException();}

      if (this.angle < 0 || this.angle > MAXIMUM_DEGREE_VALUE)
      {
        throw new NumberFormatException();
      }
      return this.angle;
   }

  /**
   *  Method to validate the optional time slice argument
   *  @param  argValue  String from the main programs args[1] input
   *  @return double-precision value of the argument or -1.0 if invalid
   *  note: if the main program determines there IS no optional argument supplied,
   *         I have elected to have it substitute the string "60.0" and call this
   *         method anyhow.  That makes the main program code more uniform, but
   *         this is a DESIGN DECISION, not a requirement!
   *  note: remember that the time slice, if it is small will cause the simulation
   *         to take a VERY LONG TIME to complete!
   */
   public double validateTimeSliceArg( String argValue )
   {

     try { this.timeSlice = Double.parseDouble( argValue ); }
     catch (Exception e) { this.timeSlice = DEFAULT_TIME_SLICE_IN_SECONDS;
     }

    if ( this.timeSlice <= 0 || this.timeSlice > MAXIMUM_TIME_SLICE )
    {
      this.timeSlice = DEFAULT_TIME_SLICE_IN_SECONDS;
    }

    return this.timeSlice;
 }

  /**
   *  Method to calculate and return the current position of the hour hand
   *  @return double-precision value of the hour hand location
   */
   public double getHourHandAngle()
   {
      this.hourHandAngle = this.totalSeconds * HOUR_HAND_DEGREES_PER_SECOND;
      return this.hourHandAngle;
   }

  /**
   *  Method to calculate and return the current position of the minute hand
   *  @return double-precision value of the minute hand location
   */
   public double getMinuteHandAngle()
   {
     this.minuteHandAngle = ( this.totalSeconds * MINUTE_HAND_DEGREES_PER_SECOND ) -
                            ( MAXIMUM_DEGREE_VALUE * Math.floor( ( this.totalSeconds * MINUTE_HAND_DEGREES_PER_SECOND ) / MAXIMUM_DEGREE_VALUE ) );
     return this.minuteHandAngle;
   }

  /**
   *  Method to calculate and return the angle between the hands
   *  @return double-precision value of the angle between the two hands
   */
   public double getHandAngle()
   {
     return ( Math.abs( this.getHourHandAngle() - this.getMinuteHandAngle() ) > 180.0 ) ?
            ( MAXIMUM_DEGREE_VALUE - Math.abs( this.getHourHandAngle() - this.getMinuteHandAngle() ) ) : Math.abs( this.getHourHandAngle() - this.getMinuteHandAngle() );
  }

  /**
   *  Method to fetch the total number of seconds
   *   we can use this to tell when 12 hours have elapsed
   *  @return double-precision value the total seconds private variable
   */
   public double getTotalSeconds()
   {
      return this.totalSeconds;
   }

  /**
   *  Method to return a String representation of this clock
   *  @return String value of the current clock
   */
   public String toString()
   {
      String PatternHourMin = "00";
      String PatternSecond = "00.0";
      DecimalFormat formatHM = new DecimalFormat(PatternHourMin);
      DecimalFormat formatSec = new DecimalFormat(PatternSecond);
      return formatHM.format(this.hour) + " : " + formatHM.format(this.minute) + " : " + formatSec.format(this.second);

   }

  /**
   *  The main program starts here
   *  remember the constraints from the project description
   *  @see  http://bjohnson.lmu.build/cmsi186web/homework04.html
   *  be sure to make LOTS of tests!!
   *  remember you are trying to BREAK your code, not just prove it works!
   */
   public static void main( String args[] ) {

      System.out.println( "\nCLOCK CLASS TESTER PROGRAM\n" +
                          "--------------------------\n" );
      System.out.println( "  Creating a new clock: " );
      ClockEmpty clock = new ClockEmpty();
      System.out.println( "    New clock created: " + clock.toString() );
      System.out.println( "    Testing validateAngleArg()....");
      System.out.print( "      sending '  0 degrees', expecting double value   0.0" );
      try { System.out.println( (0.0 == clock.validateAngleArg( "0.0" )) ? " - got 0.0" : " - no joy" ); }
      catch( Exception e ) { System.out.println ( " - Exception thrown: " + e.toString() ); }
   }
}
