import java.util.Arrays;

public class Halver {

   private String myNumber = "";
   private String reversed = "";
   private byte[] a        = null;
   private byte[] b        = null;


   public Halver()
   {
      super();
   }


   public void toArray( byte[] c )
   {
      System.out.println( "array value is: " + Arrays.toString( c ) );
   }


   public String halve( String input )
   {
   
      int          j        = 0;
      String       result_s = null;
      StringBuffer result   = null;

      myNumber = input;
      reversed = new String( new StringBuffer( myNumber ).reverse() );
      a = new byte[myNumber.length() + 1];   // extra place to handle "carry"
      b = new byte[myNumber.length()];

      for( int i = 0; i < a.length - 1; i++ )
      {
         a[i] = (byte)((int)(myNumber.charAt(i)) - 48);         // NOTE: only works for ASCII
      }

      for( int i = 0; i < b.length; i++ )
      {
         b[i] = (byte)((int)a[i] / 2);
         if( 1 == ((int)a[i] - ((int)b[i] * 2)) )
         {
            a[i+1] = (byte)((int)a[i+1] + 10);
         }
      }

      int start = 0;
      if( 0 == b[0] )
      {
         start = 1;
      }

      result = new StringBuffer();
      for( int i = start; i < a.length - 1; i++ )
      {
         result = result.append( (int)b[i] );
      }
      return new String( result );

   }

   public static void main( String[] args )
   {
      if( args.length == 0 )
      {
         System.out.println( "\n   Sorry, you must at least supply one argument." );
         System.exit( -1 );
      }
      Halver h = new Halver();
      System.out.println( h.halve( args[0] ) );
      System.exit( 0 );
   }
}

