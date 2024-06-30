package difficulty800;
import java.util.Scanner;

public class NearlyLuckyNum {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        
        int brojac = 0;
        for(int i = 0; i < num.length(); i++){
            if(num.charAt(i) == '4' || num.charAt(i) == '7'){
                brojac++;
            }
        }
        if(brojac == 4 || brojac == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        input.close();
    }
}
