package difficulty800;
import java.util.Scanner;

public class Translation {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String translation = input.nextLine();
        boolean correct = true;

        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != translation.charAt(translation.length() - 1 - i)){
                correct = false;
                System.out.println("NO");
                break;
            }
        }
        if(correct){
            System.out.println("YES");
        }
        input.close();
    }
}
