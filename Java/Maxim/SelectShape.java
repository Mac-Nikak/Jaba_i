import java.util.Scanner;

public class SelectShape {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("******************************************");
        System.out.print("This program prints a shape of your choice\n" +
                "Select by entering number\n" +
                "0. Right-angle triangle\n" +
                "1. Isosceles\n" +
                "2. Square\n" +
                "3. Parallelogram\n");
        System.out.print("Enter shape: ");
        int shape = keyboard.nextInt();
        System.out.print("Enter height: ");
        int height = keyboard.nextInt();
        figure(shape, height);
    }

    public static void figure(int shape, int height){
        switch(shape){
            case 0: rightTriangle(height); break;
            case 1: isosceles(height); break;
            case 2: square(height); break;
            case 3: parallelogram(height);break;
            default: throw new IllegalArgumentException("wrong number");
        }
    }

    public static void rightTriangle(int height){
        for(int i = 1; i<= height;i++ ){
            for(int j = 1; j<=i;j++){
                System.out.print('#');
            }
            if(i!= height)
                System.out.print('\n');
        }
    }

    public static void isosceles(int height){
        int u;
        if(height %2 == 0){
            height++;
        }
        for(int i = 0; i < height; i++){
            u = 2 * height +1;
            for(int j= 0; j < u ; j++){
                if( j >= u/2 -i && j<= u/2 + i){
                    System.out.print('#');
                }
                else {
                    System.out.print(' ');
                }
            }
            if(i!= height - 1){
                System.out.print('\n');
            }
        }
    }

    public static void square(int height){
        for(int i = 0; i< height; i++){
            for(int j = 0; j < height; j++){
                System.out.print('#');
            }
            if(i!=height-1){
                System.out.print("\n");
            }
        }

    }

    public static void parallelogram(int height){
        for(int i = 0; i<height; i++){
            for(int j = 0; j< height+i;j++){
                if(j < i){
                    System.out.print(' ');
                }
                else{
                    System.out.print('#');
                }
            }
            if (i!= height-1){
                System.out.print('\n');
            }
        }
    }
}
