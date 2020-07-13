import java.util.Scanner;

public class RootApprox {
    final static double  SMALL = 0.000000000000001;
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
        double num = keyboard.nextFloat();
        System.out.printf("Your approximate root is equal %.20f%n", approximateRoot(num));
    }

    public static double approximateRoot(double n){
        double low = 0, high = n +0.5, root, square, diff;
        long i =1;
        do{
            root = (low + high)/2;
            square = root * root;
            diff = n - square;
            if (diff > 0){
                low = root;
            } else if (diff == 0){
                return root;
            }else{
                high = root;
            }

            i++;
            if(i > 1000000000) {
                i = 0;
                System.out.printf("%.25f%n",root);
            }
        }while(Math.abs(diff) > SMALL);
        return root;
    }
}
