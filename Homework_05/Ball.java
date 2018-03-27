/*
Simultaneously, on a perfectly flat playground, at time 00:00:00.0 (hrs:mins:secs),
an arbitrary number of soccer balls are kicked, all at different speeds and directions.
 We wish to find out, via a discrete simulation of the system, whether a collision will ever take place,
 and, if so, where and when. Each ball has a radius of 4.45 inches and weighs one pound.
 The center of the playground is presumed to be the point (x,y) = (0.0,0.0).
*/


public class Ball {
   int weight;
   double radius;
   double xPosition;
   double yPosition;
   double xSpd;
   double ySpd;

   /**
   *  Constructor
   *  This makes a ball with weight 1, radius .37 in feet or 4.45 inches, and initializes position based on user input
   */

   public Ball(double x, double y, double xSpd, double ySpd)
   {
      weight = 1;
      radius = 0.37;
      xPosition = x;
      yPosition = y;
      xSpd = xSpd;
      ySpd = ySpd;
   }

   public double getRadius()
   {
      return radius;
   }

   public int getWeight()
   {
      return weight;
   }

   public void getBothPosition()
   {
      String s = "";
      String s1 = "";
      s = Double.toString(xPosition);
      s1 = Double.toString(yPosition);
      System.out.println(s + ", " + s1);
   }

   public double getXPosition()
   {
      return xPosition;
   }

   public double getYPosition()
   {
      return yPosition;
   }

   public void setPosition(double x, double y)
   {
      xPosition = x;
      yPosition = y;
   }

   /**
   *  Method
   *  Moves ball according to timeslice
   */
   public void moveBall(double seconds)
   {
      if ((Math.sqrt(xSpd * xSpd + ySpd * ySpd) > 0.083))
      {

         while (seconds >= 1)
         {
           xPosition += xSpd;
           yPosition += ySpd;
           xSpd = xSpd * 0.99;
           ySpd = ySpd * 0.99;
           seconds -= 1;
         }

         if (seconds > 0)
         {
           xPosition += xSpd * seconds;
           yPosition += ySpd * seconds;
           xSpd -= 0.01 * xSpd * seconds;
           ySpd -= 0.01 * ySpd * seconds;
         }
      }
   }

   /**
   *  Method
   *  Checks to see if the velocity is low enough
   */
   public boolean isZeroVelocity()
   {
      if (xSpd <= 0.083 && ySpd <= 0.083)
      {
         return true;
      }

      return false;
   }

   /**
   *  Method
   *  Determines distance between two balls
   */
   public double getDistance(Ball b)
   {
      double distance = Math.sqrt(Math.pow(b.xPosition - xPosition, 2) + Math.pow(b.yPosition - yPosition, 2));
      return distance;
   }

   /**
   *  Method
   *  Checks to see whether or not two balls are colliding
   */
   public boolean isColliding(Ball b)
   {
      if (getDistance(b) <= 0.74)
      {
         return true;
      }

      return false;
   }
 }
