package difficulty800;
import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) throws Exception {
        int matrix[][] = new int[5][5];
        Scanner unos = new Scanner(System.in);

        int pomeranje = 0;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                matrix[i][j] = unos.nextInt();
                if(matrix[i][j] == 1){
                    pomeranje = Math.abs(2-i) + Math.abs(2-j);
                }
            }
        }
        System.out.println(pomeranje);
        unos.close();
    }
}
