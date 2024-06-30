package difficulty800;
import java.util.Scanner;

public class TwoBears {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int counter = 0;
        while(!(a > b)){
            a *= 3;
            b *= 2;
            counter++;
        }

        System.out.println(counter);
        input.close();
    }
}
