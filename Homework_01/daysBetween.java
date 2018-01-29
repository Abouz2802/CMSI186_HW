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
   
   public static void main (Strings[] args) {
   
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
      }
