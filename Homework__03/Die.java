public class Die {

  /**
   * private instance data
   */
   private int sides;
   private int pips;
   private final int MINIMUM_SIDES = 4;

   // public constructor:
  /**
   * constructor
   * @param nSides int value containing the number of sides to build on THIS Die
   * @throws       IllegalArgumentException
   * Note: parameter must be checked for validity; invalid value must throw "IllegalArgumentException"
   */
   public Die( int nSides ) {
      if( MINIMUM_SIDES > nSides ) {
         throw new IllegalArgumentException( "side count" );
      } else {
         this.sides = nSides;
         this.pips  = nSides;
      }
   }

  /**
   * Roll THIS die and return the result
   * @return  integer value of the result of the roll, randomly selected
   */
   public int roll() {
      this.pips = (int)Math.floor( Math.random() * this.sides + 1 );
      return this.pips;
   }

  /**
   * @return the side count of THIS die instance
   */
   public int getSides() {
      return this.sides;
   }

  /**
   * Get the value of THIS die to return to the caller; note that the way
   *  the count is determined is left as a design decision to the programmer
   *  For example, what about a four-sided die - which face is considered its
   *  "value"?
   * @return the integer pip count of THIS die instance
   */
   public int getValue() {
      return this.pips;
   }

  /**
   * Set the number of sides of THIS die
   * @param  int  the number of sides to set/reset for this Die instance
   * @return      The new number of sides, in case anyone is looking
   * @throws      IllegalArgumentException
   */
   public void setSides( int sides ) {
      this.sides = sides;
   }

  /**
   * Public Instance method that returns a String representation of THIS die instance
   * @return String representation of this Die
   */
   public String toString() {
      return "{" + this.pips + "}";
   }

  /**
   * Class-wide method that returns a String representation of THIS die instance
   * @return String representation of this Die
   */
   public static String toString( Die d ) {
      return "";
   }

  /**
   * A little test main to check things out
   */
   public static void main( String[] args ) {
      Die d = null;
      try { d = new Die( 1 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      try { d = new Die( 2 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      try { d = new Die( 3 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      try { d = new Die( 4 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      System.out.println( "roll() test for 4 sided die: " );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "Current value is: " + d.toString() );
      try { d = new Die( 5 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      System.out.println( "roll() test for 5 sided die: " );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "Current value is: " + d.toString() );
      try { d = new Die( 6 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      System.out.println( "roll() test for 6 sided die: " );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "Current value is: " + d.toString() );
      try { d = new Die( 7 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      System.out.println( "roll() test for 7 sided die: " );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "Current value is: " + d.toString() );
      try { d = new Die( 8 ); }
      catch( IllegalArgumentException iae ) { System.out.println( "Too few sides requested to constructor...." ); }
      System.out.println( "roll() test for 8 sided die: " );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "You rolled a " + d.roll() );
      System.out.println( "Current value is: " + d.toString() );
      System.out.println( "Current die side count is: " + d.getSides() );
      d.setSides( 11 );
      System.out.println( "Resetting - current die side count is now: " + d.getSides() );
      System.out.println( "Rolling with new side count -- " );
      System.out.println( "   You rolled a " + d.roll() );
      System.out.println( "   You rolled a " + d.roll() );
      System.out.println( "   You rolled a " + d.roll() );
      System.out.println( "   You rolled a " + d.roll() );
      System.out.println( "   You rolled a " + d.roll() );
      d.setSides( 17 );
      System.out.println( "Resetting - current die side count is now: " + d.getSides() );
      System.out.println( "Rolling with new side count -- " );
      System.out.println( "   You rolled a " + d.roll() );
      System.out.println( "   current value is: " + d.getValue() );
   }

}
