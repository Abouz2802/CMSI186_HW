public class Fibonacci{
  
  private static BrobInt answer = new BrobInt("0");
  private static BrobInt twoBack = BrobInt.ZERO;
  private static BrobInt oneBack = BrobInt.ONE;

  public static BrobInt getNum(int n)
  {
    if(n == 1)
    {
      return twoBack;
    } else if(n == 2)
      
    {
      return oneBack;
    } else
    {
      for(int i=2;i<n;i++)
      {
        answer = twoBack.add(oneBack);
        twoBack = oneBack;
        oneBack = answer;
      }
    }
    return answer;
  }
  public static void main(String args[])
  {
    System.out.println(getNum(Integer.parseInt(args[0])));
  }
}
