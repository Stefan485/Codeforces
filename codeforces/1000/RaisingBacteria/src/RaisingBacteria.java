import java.util.Scanner;

public class RaisingBacteria {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        if(x % 2 == 1){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}
