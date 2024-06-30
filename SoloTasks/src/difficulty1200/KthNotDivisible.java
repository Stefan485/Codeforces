package difficulty1200;

import java.util.Scanner;

public class KthNotDivisible {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        int i = 0;
                
        while(i < testCases){
            int n = input.nextInt();
            int k = input.nextInt();

            int number = k / (n - 1) * n;
            if(k % (n - 1) == 0 ){
                number--;
            }
            else{
                number += k % (n - 1);
            }
            System.out.println(number);
            i++;
        }

        input.close();
    }
}
