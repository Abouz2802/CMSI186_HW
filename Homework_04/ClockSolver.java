public class ClockSolver
{
/**
   *  The main program starts here
   *  remember the constraints from the project description
   *  @see  http://bjohnson.lmu.build/cmsi186web/homework04.html
   *  @param  args  String array of the arguments from the command line
   *                args[0] is the angle for which we are looking
   *                args[1] is the time slice; this is optional and defaults to 60 seconds
   */
   public static void main( String args[] )
   {

     double MAX_NUM_OF_TOTAL_SECONDS = 43200.0;
     double EPSILON_VALUE = .5;      // small value for double-precision comparisons
     double this.angle = 0.0;
     double this.timeSlice = 3;

     System.out.println( "\n   Hello world, from the ClockSolver program!!\n\n" ) ;
     if( 0 == args.length ) {
        System.out.println( "   Sorry you must enter at least one argument\n" +
                            "   Usage: java ClockSolver <angle> [timeSlice]\n" +
                            "   Please try again..........." );
        System.exit( 1 );
     }

     Clock clock = new Clock();

     try { this.angle = clock.validateAngleArg( args[0] ); }
     catch (Exception e) { System.out.println( "Angle argument must be between 0 and 360 degrees inclusive." ); }

     try { this.timeSlice = clock.validateTimeSliceArg( args[1] ); }
     catch (Exception e) { this.timeSlice = clock.validateTimeSliceArg(""); } // will set timeSlice to 60.0

     this.angle = ( this.angle > 180 ) ? this.angle - 180 : this.angle;

     System.out.println("Clock is running...");
     System.out.println( "Looking for angle " + this.angle + " with time intervals of " + this.timeSlice + " seconds." );
     System.out.println( " \nFound target angle of " + this.angle + " at times: " );
     while( clock.getTotalSeconds() < MAX_NUM_OF_TOTAL_SECONDS ) {
        if ( Math.abs( clock.getHandAngle() -  this.angle ) <= EPSILON_VALUE ) {
          System.out.println( "   " + clock.toString() );
        }
        clock.tick();
      }

      System.exit( 0 );
   }
}
