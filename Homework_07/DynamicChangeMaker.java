import java.util.Scanner;
import java.util.Arrays;

public class DynamicChangeMaker {


	public static boolean checkInput(int[] coins, int totalValue)
  {

		for (int i = 0; i < coins.length; i++)
    {
			if (coins[i] <= 0) {
				System.out.println("BAD DATA:  Coins must be positive numbers");
				return false;
			}

			for (int j = 0; j < coins.length; j++)
      {
				if (j != i && coins[i] == coins[j])
        {
					System.out.println("BAD DATA:  None of the same coins allowed");
					return false;
				}
			}
		}
		if (totalValue <= 0)
    {
			System.out.println("BAD DATA:  target must be a positive integer");
			return false;
		}

		return true;
	}


	public static Tuple makeChangeWithDynamicProgramming(int[] coins, int totalValue)
  {

		if (!checkInput(coins, totalValue))
    {
			return Tuple.IMPOSSIBLE;
		}


		Tuple [][]  tArr;
		Tuple solution = Tuple.IMPOSSIBLE;

		int rowCount = coins.length;
		int columnCount = totalValue + 1;
		tArr = new Tuple[rowCount][columnCount];



		for( int i = 0; i < rowCount; i++ )
    {
			for( int j = 0; j < columnCount; j++ )
      {


				if( j == 0)
        {

					tArr[i][j] = Tuple.IMPOSSIBLE;
					continue;
				}

				if(0 > j - coins[i])
        {

					if(i != 0)
          {
						tArr[i][j] = Tuple.IMPOSSIBLE;

						if(tArr[i-1][j] != Tuple.IMPOSSIBLE)
            {
							tArr[i][j] = new Tuple(Arrays.copyOf(tArr[i - 1][j].data, i + 1));
						}
					}
				}

				else
        {

					tArr[i][j] = new Tuple(i + 1);
					tArr[i][j].setElement(i, 1);

					if(j - coins[i] >= 0)
          {

						if (tArr[i][j - coins[i]] == Tuple.IMPOSSIBLE)
            {
							tArr[i][j] = Tuple.IMPOSSIBLE;
						} else
            {
							tArr[i][j] = tArr[i][j].add(tArr[i][j - coins[i]]);
						}
					}

					if( i != 0 )
          {

						if (tArr[i][j] != Tuple.IMPOSSIBLE)
            {
							if (tArr[i - 1][j].total() < tArr[i][j].total()
									&& tArr[i - 1][j] != Tuple.IMPOSSIBLE)
                  {
								tArr[i][j] = new Tuple(Arrays.copyOf(tArr[i - 1][j].data, i + 1));
							}
						} else if (tArr[i - 1][j] != Tuple.IMPOSSIBLE)
             {
							tArr[i][j] = new Tuple(Arrays.copyOf(tArr[i - 1][j].data, i + 1));
				  		}
					}
				}

				if (j == totalValue)
         {
					if (tArr[i][j].total() <= solution.total() || solution == Tuple.IMPOSSIBLE)
          {
						solution = tArr[i][j];
					}
				}
			}
		}

		return solution;



	}


	public static void main(String[] args) {

		int[] ar = {5,10,20,50};
		System.out.println(DynamicChangeMaker.makeChangeWithDynamicProgramming(ar, 85));


	}

}
