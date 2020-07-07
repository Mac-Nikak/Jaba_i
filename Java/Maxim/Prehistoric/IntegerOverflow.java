import java.util.Scanner;

public class IntegerOverflow {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        byte x = keyboard.nextByte();
        while (x>0){
            System.out.printf("Our byte is equal: %f%n", x);
            x *= 2;
        }
        System.out.printf("Our byte is equal: %f%n", x);
    }
}
