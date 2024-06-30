package difficulty800;
import java.util.Scanner;

public class Capitalization {
    public static void main(String[] args) throws Exception {
        Scanner unos = new Scanner(System.in);
        String input = unos.nextLine();
        String output = "";
        if(input.charAt(0) >= 97 && input.charAt(0) <= 122){
            String fristLetter = "" + input.charAt(0);
            fristLetter = fristLetter.toUpperCase();
            output = fristLetter + input.substring(1, input.length());
            System.out.println(output);
        }
        else{
            System.out.println(input);
        }
        unos.close();
    }
}
