import java.util.Scanner;

public class scan {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String s;
        int mindep = 150, x=0, z = 0, n=0;
        while( x < mindep){
            System .out. printf ( " Deposit is %d cents %n", x );
            System .out. println ( " What coin do you deposit ? " );
            System .out. print ( "N for Nickel , D for Dime , Q for Quarter : " );
            s = keyboard.next();
            switch(s.charAt(0)){
                case 'N': z = 5; break;
                case 'D': z = 10; break;
                case 'Q': z = 25; break;
                default: System.out.println("Enter correct char: ");
            }
            System.out.print("How many coins do you want to insert: ");
            n = Math.max(1, keyboard.nextInt());
            x += z*n;
        }
        System .out. printf ( " Deposit is %d cents %n", x );
        System .out. println ( " Now you can make a selection ." );

        }
    }

