import java . util .*;
public class HasNext01
{
        public static void main ( String [] args )
        {
        Scanner keyboard = new Scanner ( System .in );
        int input , total = 0;
        System .out. print ( "Enter input : " );
        while ( keyboard . hasNext () )
         {
         input = keyboard . nextInt ();
         total += input ;
         System .out. printf ( "Input =%d, Total =%d%n", input , total );
         System .out. print ( "Enter input : " );
         }
         System .out. println ( "... End of the program ." );
         }
         }