import java.util.Scanner;

public class cal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the start day: ");
        int d = in.nextInt();
        System.out.print("Enter number of days: ");
        int numberOfDays = in.nextInt();
        exc(numberOfDays);
        System.out.printf("%5s%7s%7s%7s%7s%7s%7s   %n","Sun","Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        bottomtop();
        int l =7* (int) Math.ceil((numberOfDays +d)/7.0);
        int i,j=1;
        for(i=1; i<= l; i++){
            if (i <= d || j > numberOfDays){
                System.out.print("|      ");
            }
            else{
                System.out.printf("|%4d  ",j);
                j++;
            }
            if (i%7==0){
                System.out.printf("|%n");
            }
        }
        bottomtop();
    }

    public static void exc(int numberOfDays){
        if (!(numberOfDays == 28 || numberOfDays == 29 ||
                numberOfDays == 30 || numberOfDays == 31)){
            throw new IllegalArgumentException(
                    "You entered wrong number of days"
            );
        }
    }
    public static void bottomtop(){
        System.out.println("+------+------+------+------+------+------+------+");
    }
}
