import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number = input.nextInt();
        int count = 0;

        for(int i = 1; i <= n; i++){
            if(number % i == 0){
                int temp = number / i;
                if(temp <= n){
                    count++;
                }
            }
        }

        System.out.println(count);

        input.close();
    }
}
