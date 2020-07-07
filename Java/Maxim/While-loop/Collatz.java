import java.util.Scanner;

public class Collatz {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        long x = keyboard.nextLong(), i=0;
        while(x != 1){
            if( i % 1 == 0){
                System.out.printf("Your number is know equal: %d %n", x);
            }
            x = update(x);
            i++;
        }

    }
    public static long update(long x){
        if (x % 2 == 0){
            return x/2;
        } else{
            return 3*x+1;
        }
    }
}
