import java.math.BigInteger;


public class problem {
    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(149);
        BigInteger y = BigInteger.valueOf(2);
        BigInteger z = BigInteger.valueOf(69486440625L);
        int i = 1;
        while(true){
            BigInteger a1 = x.pow(i);
            BigInteger a2 = y.pow(i);
            BigInteger a3 = a1.subtract(a2);
            BigInteger[] a4 = a3.divideAndRemainder(z);
            if (i % 10000 == 0)
                System.out.println(i);
            if (a4[1].equals(BigInteger.ZERO))
            {
                break;
            }
               i ++;
        }
        System.out.println(i);

    }



}
