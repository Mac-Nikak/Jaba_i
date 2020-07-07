import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter number which to convert to binary: ");
            x = keyboard.nextInt();
            System.out.printf("Number %d in binary is %s%n", x, binary(x));
        }while (x >= 0);
    }

    public static String binary(int x){
        if(x == 0){
            return "0";
        }else{
            String bin = "";
            while(x>0){
                int bit = x %2;
                bin = bit + bin;
                x /= 2;
            }
            return bin;
        }
    }
}
