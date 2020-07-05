import java.util.Scanner;

public class SwitchChar {
    static int nPeriod, nComma, nQuestion;
    static int nColon, nSemicolon, nExclamation, nOther;
    public static String receiveLines(){
        Scanner keyboard = new Scanner(System.in);
        int num = 10;
        StringBuilder input = new StringBuilder();
        System.out.printf("You should enter %d lines %n", num);
        for(int i =0 ; i < num ; i++){
            input.append(keyboard.nextLine());
            input.append('\n');
        }
        return input.toString();
    }
    public static void main(String[] args){
        count(receiveLines());
        printInfo(".", nPeriod);
        printInfo(",", nColon);
        printInfo("?", nQuestion);
        printInfo(":", nColon);
        printInfo(";", nSemicolon);
        printInfo("!", nExclamation);
        printInfo("others", nOther);
    }

    public static void count(String input){
        nPeriod = 0; nComma = 0; nQuestion = 0; nColon = 0;
        nSemicolon = 0; nExclamation = 0; nOther = 0;
        for (int i = 0; i < input.length(); i++){
            switch(input.charAt(i)){
                case '.': nPeriod ++; break;
                case ',': nComma ++; break;
                case '?': nQuestion++; break;
                case ':': nColon++;break;
                case ';': nSemicolon ++; break;
                case '!': nExclamation++; break;
                default: nOther++;
            }
        }
    }
    public static void printInfo(String in, int times){
        System.out.printf("%10s occurs %3d times in text%n", in, times);
    }
}
