import java.util.Scanner;

public class LowCase {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter: ");
        String input = keyboard.nextLine();
        String output = collect(input);
        System.out.printf("The string: %n %s %n converted to: %n %s %n", input, output);
    }
    public static String collect(String input){
        int i,j=0;
        StringBuilder data = new StringBuilder();
        for (i = 0; i < input.length(); i++){
            char x = input.charAt(i);
            if((x >= 'a' && x<= 'z') ){
                data.append(x);
            }
        }
        i = data.length();
        for (;i>= 1; i--){
            if(i %10 == 0 ){
                data.insert(i,"\n ");
            }
        }
        return data.toString();
    }
}
