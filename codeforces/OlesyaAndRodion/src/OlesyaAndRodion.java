import java.util.Scanner;

public class OlesyaAndRodion {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();

        String num = "";
        if(n <= 1 && t >= 10){
            System.out.println(-1);
        }
        else{
            if(t == 10){
                for(int i = 0; i < n -1; i++){
                    num += 1;
                }
                num += 0;
            }
            else{
                for(int i = 0; i < n; i++){
                   num += t;
                }
            }
            System.out.println(num);
        }

        input.close();
    }
}
