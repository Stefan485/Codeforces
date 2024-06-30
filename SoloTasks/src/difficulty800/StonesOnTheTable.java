package difficulty800;
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n;
        
        do{
            n = input.nextInt();
            input.nextLine();
        }while(n < 1 || n > 50);

        String s = input.nextLine();

        int counter = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                counter++;
            }
        }

        System.out.println(counter);
        input.close();
    }
}
