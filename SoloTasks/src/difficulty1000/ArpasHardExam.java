package difficulty1000;

import java.util.Scanner;

public class ArpasHardExam {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = {8, 4, 2, 6};
        if(n == 0){
            System.out.println(1);
        }
        else if(n % 4 == 0){
            System.out.println(arr[3]);
        }
        else{
            System.out.println(arr[n % 4 - 1]);
        }




        input.close();
    }
}
