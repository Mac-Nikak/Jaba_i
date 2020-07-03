public class Circle {
   public static void main(String[] args){
       double x = 1, y =1;
       PolarToCartesianAndBackwards in = new PolarToCartesianAndBackwards(true,Math.sqrt(2),135);
       System.out.println(in.getCartesianX());
       System.out.println(in.getCartesianY());
       System.out.println(in.getPolarRadius());
       System.out.println(in.getPolarAngle());
       System.out.println(in.getCartesianX());
       System.out.println(in.getCartesianY());
       System.out.println(in.getPolarRadius());
       System.out.println(in.getPolarAngle());
   }
}
