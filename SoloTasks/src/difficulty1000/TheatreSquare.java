package difficulty1000;

import java.math.BigInteger;
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        BigInteger m = input.nextBigInteger();
        BigInteger a = input.nextBigInteger();

        BigInteger count = BigInteger.ZERO;
        count = count.add(n.divide(a));
        if(n.mod(a) != BigInteger.ZERO){
            count = count.add(BigInteger.ONE);
        }
        if(m.mod(a) != BigInteger.ZERO){
            count = count.multiply(m.divide(a).add(BigInteger.ONE));
        }
        else{
            count = count.multiply(m.divide(a));
        }

        System.out.println(count);

        input.close();
    }
}
