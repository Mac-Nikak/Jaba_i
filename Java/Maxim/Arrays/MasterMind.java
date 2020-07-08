import java.util.Scanner;

public class MasterMind {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        int y,x;
        x = firstPlayer();
        do{
            System.out.print("Enter your number: ");
            y = keyboard.nextInt();
            check(x,y);
        }while(x != y );

    }

    public static int firstPlayer(){
        int x;
        do{
            x = (int) Math.floor(123 + 865 * Math.random());
        } while(!check(x));
        return x;
    }

    public static boolean check(int x){
        if (x% 10 == (x /10)%10 || x % 10 == x /100 ||
                (x /10)%10 == x / 100){
            return false;
        }else{
            return true;
        }
    }

    public static void check(int x, int y){
        int[] hitmiss;
        if (x == y){
            System.out.println("You guessed!");
        }else {
            hitmiss = countHitsMiss(x,y);
            System.out.printf("You hit %d  and missed %d times!%n", hitmiss[0], hitmiss[1]);
        }
    }

    public static int[] countHitsMiss(int x, int y) {
        int u = 0, v = 0;
        int[] hitmiss = new int[2];
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                if (x / ((int) Math.pow(10, i)) - u == y / ((int) Math.pow(10, j)) - v) {
                    if (i == j) {
                        hitmiss[0]++;
                    } else {
                        hitmiss[1]++;
                    }
                }
                v = y / ((int) Math.pow(10, j)) * 10;
            }
                v = 0;
                u = x / ((int) Math.pow(10, i)) * 10;
        }
        return hitmiss;
    }
}
