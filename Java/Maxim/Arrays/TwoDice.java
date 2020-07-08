import java.util.Scanner;

public class TwoDice {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        double y = 0.;
        int[] data = new int[11];
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter how many iterations do you want: ");
        long n = keyboard.nextLong();
        System.out.println();
        for(int i = 0; i< n; i++){
            int x = (int) (Math.random() * 6)  + (int) (Math.random() * 6 ) + 2;
            data[x-2] ++;
        }

        for(int i = 2; i<=12; i++ ){
            y += data[i-2]/ (double) n * i;
            System.out.printf("%10d: share: %.15f number: %20d %n ", i ,data[i-2]/ (double) n, data[i-2]);
        }
        System.out.printf("E is equal %f %n", y);
        float elapsedTimeMillis = System.currentTimeMillis()-start / 1000F;
        System.out.println(elapsedTimeMillis);
    }
}
