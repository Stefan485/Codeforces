package difficulty1000;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int goals = input.nextInt();
        input.nextLine();

        int result = 0;
        String[] arr = new String[2];
        for(int i = 0; i < goals; i++){
            String temp = input.nextLine();
            if(arr[0] == null || arr[0].equals(temp)){
                arr[0] = temp;
                result++;
            }
            else{
                arr[1] = temp;
                result--;
            }
        }
        if(result > 0){
            System.out.println(arr[0]);
        }
        else{
            System.out.println(arr[1]);
        }

        input.close();
    }
}
