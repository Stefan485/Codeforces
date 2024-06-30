package difficulty1000;

import java.util.Scanner;

public class Expression {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int res1 = (a + b) * c;
        int res2 = a * (b + c);
        int res3 = a * b * c;
        int res4 = a + b + c;
        int max = Math.max(res1, res2);
        max = Math.max(max, res3);
        max = Math.max(max, res4);
        System.out.println(max);

        input.close();
    }
}
