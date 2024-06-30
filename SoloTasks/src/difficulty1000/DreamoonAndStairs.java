package difficulty1000;

import java.util.Scanner;

public class DreamoonAndStairs {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int stairs = input.nextInt();
        int div = input.nextInt();

        if(stairs < div){
            System.out.println(-1);
        }
        else{
            int closest = stairs - stairs % div;
                closest = closest / 2;
                if(closest * 2 != stairs){
                    closest++;
                }
            while(closest % div != 0){
                closest++;
            }
            System.out.println(closest);
        }

        input.close();
    }
}
