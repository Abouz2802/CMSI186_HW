import java.lang.*;

public class SoccerSimulator
{

	public static void main(String args[])
	{
      int numOfBalls;
      Timer clock = new Timer();
      Ball[] ballArray;
      if (args.length < 9)
			{
         throw new UnsupportedOperationException("Please enter at least two balls and it's positions, as well as the timeslice. Ex. (java SoccerSim 0 3 3 3 0 3 2 1 10");
      }

      if (args.length >= 9 && (args.length % 2) == 1)
			{

         numOfBalls = (int) Math.floor(args.length / 4);

         ballArray = new Ball[numOfBalls];

         for (int i = 0, j = 0; i < args.length - 1; i += 4, j++)
				 {
            ballArray[j] = new Ball(Double.parseDouble(args[i]), Double.parseDouble(args[i + 1]), Double.parseDouble(args[i + 2]), Double.parseDouble(args[i + 3]));
            System.out.println("You have created Ball: " + j + " at position: ");
            ballArray[j].getBothPosition();
         }

         while (true)
				  {
            double tickTime = clock.tick(Double.parseDouble(args[args.length - 1]));
            System.out.println("\n Time passed: " + clock.toString());

            for (int i = 0; i < ballArray.length; i++)
						{
               System.out.println("\n Ball: " + i);
               ballArray[i].moveBall(Double.parseDouble(args[args.length - 1]));
               ballArray[i].getBothPosition();
            }

            for (int i = 0; i < ballArray.length; i++)
						 {
               for (int j = i + 1; j < ballArray.length; j++)
							 {
                  if (ballArray[i].isColliding(ballArray[j]))
									{
                     System.out.println("\n Ball " + i + ": " + ballArray[i].getXPosition() + ", " + ballArray[i].getYPosition() + " is colliding with Ball " + j + ": " + ballArray[j].getXPosition() + ", " + ballArray[j].getYPosition());
                     return;
                  } else
									{
                     continue;
                  }
               }
            }

            for (int i = 0; i < ballArray.length; i++)
						{
               if (ballArray[i].isZeroVelocity() == true)
							 {
                  System.out.println("\n No Collision Found");
                  return;
               }
            }
         }
      }
   }
}
