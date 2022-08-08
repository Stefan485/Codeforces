import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int soilders = input.nextInt();

        int[] line = new int[soilders];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minInd = 0;
        int maxInd = 0;
        for(int i = 0; i < soilders; i++){
            line[i] = input.nextInt();
            if(line[i] > max){
                max = line[i];
                maxInd = i;
            }
            if(line[i] <= min){
                min = line[i];
                minInd = i;
            }
        }
        int count = 0;
        count = soilders - minInd - 1;
        if(minInd < maxInd){
            count--;
        }
        count += maxInd;
        System.out.println(count);
        input.close();
    }
}
