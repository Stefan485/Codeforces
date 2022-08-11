import java.util.Scanner;

public class Dragons {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int charStr = input.nextInt();
        int n = input.nextInt();

        int[] dragonStr = new int[n];
        int[] dragonBonus = new int[n];

        for(int i = 0; i < 2*n; i++){
            if(i % 2 == 0){
                dragonStr[i / 2] = input.nextInt();
            }
            else{
                dragonBonus[(i -1) / 2] = input.nextInt();
            }
        }

        int i = 0;
        while(i < n){
            if(charStr > dragonStr[i] && dragonStr[i] != -1){
                charStr += dragonBonus[i];
                dragonStr[i] = -1;
                i = 0;
            }
            else{
                i++;
            }
        }

        boolean possible = true;
        for(int j = 0; j < n; j++){
            if(dragonStr[j] != -1){
                possible = false;
                break;
            }
        }
        if(possible){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        input.close();
    }
}
