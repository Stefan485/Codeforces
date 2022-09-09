import java.util.Scanner;

public class FlippingGame {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        int[] arr = new int[numbers];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        int tempOnesMax = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int[] temp = arr.clone();
                int tempOnes = 0;
                
                for(int m = i; m <= j; m++){
                    if(temp[m] == 0){
                        temp[m] = 1;
                    }
                    else{
                        temp[m] = 0;
                    }
                }
                for(int m = 0; m < temp.length; m++){
                    if(temp[m] == 1){
                        tempOnes++;
                    }
                }
                if(tempOnes > tempOnesMax){
                    tempOnesMax = tempOnes;
                }

            }
        }

        System.out.println(tempOnesMax);

        input.close();
    }
}
