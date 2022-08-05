import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        char[] c = new char[first.length()];
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) == second.charAt(i)){
                c[i] = '0';
            }
            else{
                c[i] = '1';
            }
        }
        System.out.println(c);
        input.close();
    }
}
