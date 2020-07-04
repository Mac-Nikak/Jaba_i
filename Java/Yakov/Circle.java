import java.util.Scanner;

public class Circle {
   public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       double r = in.nextDouble();
       int frac = in.nextInt();
       PolarToCartesianAndBackwards tr;
       for(int angle = 180; angle >= -180; angle -= 360/frac){
           tr = new PolarToCartesianAndBackwards(true, r, angle);
           System.out.printf("(%f, %f) %n", tr.getCx(), tr.getCy());
       }
   }
}
