package difficulty800;
import java.util.Scanner;

public class Word{
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String word = input.nextLine();
        int countLower = 0;
        int countUpper = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){
                countLower++;
            }
            else{
                countUpper++;
            }
        }
        if(countLower < countUpper){
            System.out.println(word.toUpperCase());
        }
        else{
            System.out.println(word.toLowerCase());
        }
        input.close();
    }
}
