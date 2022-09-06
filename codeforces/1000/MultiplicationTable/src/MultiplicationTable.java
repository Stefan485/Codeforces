import java.util.Scanner;
import java.util.HashSet;


public class MultiplicationTable {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int number = input.nextInt();

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 1; i <= n; i++){
            if(number % i == 0){
                int temp = number / i;
                if(temp <= n){
                    set.add(i);
                }
            }
        }

        System.out.println(set.size());

        input.close();
    }
}
