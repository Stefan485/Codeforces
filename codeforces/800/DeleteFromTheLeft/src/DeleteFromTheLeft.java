import java.util.Scanner;

public class DeleteFromTheLeft {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String secc = input.nextLine();

        int count = 0;
        if(first.length() < secc.length()){
            for(int i = 0; i < first.length(); i++){
                if(first.charAt(first.length()-i- 1) == secc.charAt(secc.length()-i-1)){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        else{
            for(int i = 0; i < secc.length(); i++){
                if(secc.charAt(secc.length()-i-1) == first.charAt(first.length()-i-1)){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(first.length() - count + secc.length() - count);
        input.close();
    }
}
