package difficulty800;
import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int drinks = input.nextInt();
        float sum = 0;
        for(int i = 0; i < drinks; i ++){
            sum += input.nextInt();
        }
        System.out.println(sum/drinks);
        input.close();
    }
}
