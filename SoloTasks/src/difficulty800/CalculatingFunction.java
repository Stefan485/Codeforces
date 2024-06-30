package difficulty800;
import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BigInteger n = input.nextBigInteger();
        BigInteger one = new BigInteger("1");
        BigInteger a = new BigInteger("2");
        BigInteger minus = new BigInteger("-1");
        if(n.mod(a) == BigInteger.ZERO){
            System.out.println(n.divide(a));
        }
        else{
            System.out.println(n.divide(a).add(one).multiply(minus));
        }
        input.close();
    }
}
