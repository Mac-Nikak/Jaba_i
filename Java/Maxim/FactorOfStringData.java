import java.util.Scanner;

public class FactorOfStringData {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = keyboard.next();
        System.out.print(factor(input));
    }

    public static String factor(String input){
        String pre, check;
        for(int i = 1; i <= input.length(); i++){
            pre = input.substring(0,i);
            check = pre.repeat(input.length()/i);
            if(check.equals(input)){
                return pre;
            }
        }
        return "";
    }
}
