import java.util.Scanner;
import java.io.FileNotFoundException;

public class PizzaSimpleMain
{
    public static void main ( String [] args ) throws FileNotFoundException {
        Scanner keyboard = new Scanner ( System .in );
        PizzaSimpleCollection data ;
        if ( args . length > 0 )
        {
            data = new PizzaSimpleCollection ( args [ 0 ] );
        } else
            {
             System . out. print ( "Enter data file name : " );
             data = new PizzaSimpleCollection ( keyboard . nextLine () );
            }
        String input = "";
        do
            {
                System .out. println ( "Enter your choice by first letter " );
                System . out. print ( "View , Add , Delete , Quit : ");
                input = keyboard . nextLine ();

         switch ( input . charAt ( 0 ) )
         {
         case ('V'): data . view (); break ;
         case ('A'):
             System . out. print ( " Enter name : " );
             String name = keyboard . nextLine ();
             System . out. print ( " Enter price : " );
             double price = Double . parseDouble ( keyboard . nextLine () );
             data .add( name , price );
             break ;
         case ('D'):
             System.out.print(" Enter index : ");
             data . delete ( Integer . parseInt ( keyboard . nextLine () ) );
         }
            } while ( ! input . startsWith ( "Q" ) );

        data . write ();

    }

}