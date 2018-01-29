/**
 *  File name     :  CalendarStuff.java
 *  Purpose       :  Provides a class with supporting methods for CountTheDays.java program
 *  Author        :  B.J. Johnson (prototype)
 *  Date          :  2017-01-02 (prototype)
 *  Author        :  Anthony Bouz
 *  Date          :  2018-01-25
 *  Description   :  This file provides the supporting methods for the CountTheDays program which will
 *                   calculate the number of days between two dates.  It shows the use of modularization
 *                   when writing Java code, and how the Java compiler can "figure things out" on its
 *                   own at "compile time".  It also provides examples of proper documentation, and uses
 *                   the source file header template as specified in the "Greeter.java" template program
 *                   file for use in CMSI 186, Spring 2017.
 *  Notes         :  None
 *  Warnings      :  None
 *  Exceptions    :  None
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  Revision History
 *  ----------------
 *            Rev      Date     Modified by:  Reason for change/modification
 *           -----  ----------  ------------  -----------------------------------------------------------
 *  @version 1.0.0  2017-01-02  B.J. Johnson  Initial writing and release
 *  @version 1.0.1  2017-12-25  B.J. Johnson  Updated for Spring 2018
 */
public class CalendarStuff {

  /**
   * A listing of the days of the week, assigning numbers; Note that the week arbitrarily starts on Sunday
   */
   private static final int SUNDAY    = 0;
   private static final int MONDAY    = SUNDAY    + 1;
   private static final int TUESDAY    = MONDAY    + 1;
   private static final int WEDNESDAY    = TUESDAY    + 1;
   private static final int THURSDAY    = WEDNESDAY    + 1;
   private static final int FRIDAY    = THURSDAY    + 1;
   private static final int SATURDAY    = FRIDAY    + 1;


  /**
   * A listing of the months of the year, assigning numbers; I suppose these could be ENUMs instead, but whatever
   */
   private static final int JANUARY    = 1;
   private static final int FEBRUARY   = JANUARY   + 1;
   private static final int MARCH   = FEBRUARY   + 1;
   private static final int APRIL   = MARCH   + 1;
   private static final int MAY   = APRIL   + 1;
   private static final int JUNE   = MAY   + 1;
   private static final int JULY   = JUNE   + 1;
   private static final int AUGUST   = JULY   + 1;
   private static final int SEPTEMBER   = AUGUST   + 1;
   private static final int OCTOBER   = SEPTEMBER   + 1;
   private static final int NOVEMBER   = OCTOBER   + 1;
   private static final int DECEMBER   = NOVEMBER   + 1;


  /**
   * An array containing the number of days in each month
   *  NOTE: this excludes leap years, so those will be handled as special cases
   *  NOTE: this is optional, but suggested
   */
   private static int[]    days        = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  /**
   * The constructor for the class
   */
   public CalendarStuff() {
      System.out.println( "Constructor called..." );  // replace this with the actual code
   }

  /**
   * A method to determine if the year argument is a leap year or not<br />
   *  Leap years are every four years, except for even-hundred years, except for every 400
   * @param    year  long containing four-digit year
   * @return         boolean which is true if the parameter is a leap year
   */
   //A year is a leap year when it is divisible by 4, 100, and 400
   //So we want to type in some code so that if the year entered is divisible by 4, 100,
   //and 400, then the output will be true. Otherwise, the output shall be false

   public static boolean isLeapYear( long year ) {
     int year = Integer.parseInt(args[0]);
     if (year % 4 == 0)
     {
        println(year + " is a leap year.");
     }
     else if ((year % 4 == 0) && (year % 100 != 0))
     {
       println(year + " is a leap year.");
     }
     else if (year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)
     {
       println(year + " is a leap year.");
     }
     else
     {
       println(year + " is not a leap year.");
     }
     }

  /**
   * A method to calculate the days in a month, including leap years
   * @param    month long containing month number, starting with "1" for "January"
   * @param    year  long containing four-digit year; required to handle Feb 29th
   * @return         long containing number of days in referenced month of the year
   * notes: remember that the month variable is used as an index, and so must
   *         be decremented to make the appropriate index value
   */
   public static long daysInMonth( long month, long year ) {
     if (month == 1)
        return 31;
     }else if (month == 2) && (isLeapYear(year) = true){
        return 29;
     }else
        return 28;
     }else if (month == 3){
        return 31;
     }else if (month == 4){
        return 30;
     }else if (month == 5){
        return 31;
     }else if (month == 6){
        return 30;
     }else if (month == 7){
        return 31;
     }else if (month == 8){
        return 31;
     }else if (month == 9){
        return 30;
     }else if (month == 10){
        return 31;
     }else if (month == 11){
        return 30;
     }else if (month == 12){
        return 31;
     }
   }

  /**
   * A method to determine if two dates are exactly equal
   * @param    month1 long    containing month number, starting with "1" for "January"
   * @param    day1   long    containing day number
   * @param    year1  long    containing four-digit year
   * @param    month2 long    containing month number, starting with "1" for "January"
   * @param    day2   long    containing day number
   * @param    year2  long    containing four-digit year
   * @return          boolean which is true if the two dates are exactly the same
   */
   public static boolean dateEquals( long month1, long day1, long year1, long month2, long day2, long year2 ) {
     if (month1 == month2) && (year1 == year2) && (day1 == day2) {
      return true;
   }
   else
   {
     return false;
   }
 }

  /**
   * A method to compare the ordering of two dates
   * @param    month1 long   containing month number, starting with "1" for "January"
   * @param    day1   long   containing day number
   * @param    year1  long   containing four-digit year
   * @param    month2 long   containing month number, starting with "1" for "January"
   * @param    day2   long   containing day number
   * @param    year2  long   containing four-digit year
   * @return          int    -1/0/+1 if first date is less than/equal to/greater than second
   */
   public static int compareDate( long month1, long day1, long year1, long month2, long day2, long year2 ) {
     if (month1 == month2) && (year1 == year2) && (day1 == day2) {
      return 0;
   }
   else if (month1 > month2) && (year1 == year2) && (day1 == day2) | (month1 == month2) && (year1 > year2) && (day1 == day2) | (month1 == month2) && (year1 == year2) && (day1 > day2)
          | (month1 > month2) && (year1 > year2) && (day1 == day2) | (month1 > month2) && (year1 == year2) && (day1 > day2)  | (month1 == month2) && (year1 > year2) && (day1 > day2)
          | (month1 > month2) && (year1 > year2) && (day1 > day2)  | (month1 > month2) && (year1 == year2) && (day1 <= day2) | (month1 == month2) && (year1 > year2) && (day1 <= day2)
          | (month1 <= month2) && (year1 > year2) && (day1 <= day2)
          {
            return 1;
          }
   else {
     return -1;
   }

  /**
   * A method to return whether a date is a valid date
   * @param    month long    containing month number, starting with "1" for "January"
   * @param    day   long    containing day number
   * @param    year  long    containing four-digit year
   * @return         boolean which is true if the date is valid
   * notes: remember that the month and day variables are used as indices, and so must
   *         be decremented to make the appropriate index value
   */
   public static boolean isValidDate( long month, long day, long year ) {
     if (month == 1) && (day <= 31) && (day >= 1)
     {return true;}
     else if (month == 2) && (day <= 29) && (day >= 1) && (isLeapYear year) = true
     {return true;}
     else if (month == 2) && (day <= 28) && (day >= 1) && (isLeapYear year) = false
     {return true;}
     else if (month == 3) && (day <= 31) && (day >= 1)
     {return true;}
     else if (month == 4) && (day <= 30) && (day >= 1)
     {return true;}
     else if (month == 5) && (day <= 31) && (day >= 1)
     {return true;}
     else if (month == 6) && (day <= 30) && (day >= 1)
     {return true;}
     else if (month == 7) && (day <= 31) && (day >= 1)
     {return true;}
     else if (month == 8) && (day <= 31) && (day >= 1)
     {return true;}
     else if (month == 9) && (day <= 30) && (day >= 1)
     {return true;}
     else if (month == 10) && (day <= 31) && (day >= 1)
     {return true;}
     else if (month == 11) && (day <= 30) && (day >= 1)
     {return true;}
     else if (month == 12) && (day <= 31) && (day >= 1)
     {return true;}
     else
     {return false;}
   }

  /**
   * A method to return a string version of the month name
   * @param    month long   containing month number, starting with "1" for "January"
   * @return         String containing the string value of the month (no spaces)
   */
   public static String toMonthString( int month ) {
     if (month == 1)
     {System.out.println("JANUARY")};
     else if (month == 2)
     {System.out.println("FEBRUARY")};
     else if (month == 3)
     {System.out.println("MARCH")};
     else if (month == 4)
     {System.out.println("APRIL")};
     else if (month == 5)
     {System.out.println("MAY")};
     else if (month == 6)
     {System.out.println("JUNE")};
     else if (month == 7)
     {System.out.println("JULY")};
     else if (month == 8)
     {System.out.println("AUGUSTt")};
     else if (month == 9)
     {System.out.println("SEPTEMBER")};
     else if (month == 10)
     {System.out.println("OCTOBER")};
     else if (month == 11)
     {System.out.println("NOVEMBER")};
     else if (month == 12)
     {System.out.println("DECEMBER")};
     else
     throw new IllegalArgumentException( "Illegal month value given to 'toMonthString()'." );
      }


  /**
   * A method to return a string version of the day of the week name
   * @param    day int    containing day number, starting with "1" for "Sunday"
   * @return       String containing the string value of the day (no spaces)
   */
   public static String toDayOfWeekString( int day ) {
     if (day == 1)
     {System.out.println("SUNDAY");}
     else if (day == 2)
     {System.out.println("MONDAY");}
     else if (day == 3)
     {System.out.println("TUESDAY");}
     else if (day == 4)
     {System.out.println("WEDNESDAY");}
     else if (day == 5)
     {System.out.println("THURSDAY");}
     else if (day == 6)
     {System.out.println("FRIDAY");}
     else if (day == 7)
     {System.out.println("SATURDAY");}
     else
     throw new IllegalArgumentException( "Illegal month value given to 'toDayOfWeekString()'." );
      }
   }

  /**
   * A method to return a count of the total number of days between two valid dates
   * @param    month1 long   containing month number, starting with "1" for "January"
   * @param    day1   long   containing day number
   * @param    year1  long   containing four-digit year
   * @param    month2 long   containing month number, starting with "1" for "January"
   * @param    day2   long   containing day number
   * @param    year2  long   containing four-digit year
   * @return          long   count of total number of days
   */

   /*
    So, in order to make the counting of the days easier and not have to worry about absolute
    values, we are going to switch the two dates so that the lesser date is first. In order
    to do this, we have to use compareDate and switch the two dates if need be
   */
   public static long daysBetween( long month1, long day1, long year1, long month2, long day2, long year2 ) {

      long dayCount = 0;

      if ((year1 > year2) || (year1 == year2) && (month1 > month2) || (year1 == year2) &&
      (month1 == month2) && (day1 > day2))
      {
        //Here, we are preserving date1 so that we may later switch it to date2
        long daySwitch = day1;
        long monthSwitch = month1;
        long yearSwitch = year1;

        // Now we have to switch date1 with date2

        day1 = day2;
        month1 = month2;
        year1 = year2;

        //Finally, switch date2 with date1

        day1 = daySwitch;
        month1 = monthSwitch;
        year1 = yearSwitch;
        }

        while (year1 < year2) || (year1 == year2) && (month1 < month2) || (year1 == year2) &&
        (month1 == month2) && (day1 < day2))
        {
          day1++
          if(isValidDate(month1, day1, year1)){
            day1 = 1;
            month1++;
          }
          if(isVaildDate(month1, day1, year1)){
            month1 = 1;
            year1++;
          }
          dayCount++;
        }
        return dayCount;
      }
