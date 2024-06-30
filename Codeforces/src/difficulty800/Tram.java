package difficulty800;
import java.util.Scanner;

public class Tram {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int stations = input.nextInt();
        int passengers = 0;

        for(int i = 0; i < stations; i++){
            passengers -= input.nextInt();
            passengers += input.nextInt();

            if(passengers > max){
                max = passengers;
            }

        }

        System.out.println(max);
        input.close();
    }
}
