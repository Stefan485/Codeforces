package difficulty800;
import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int people, fence;
        people = input.nextInt();
        fence = input.nextInt();
        input.nextLine();
        int count = 0;
        int heigth;
        for(int i = 0; i < people; i++){
            heigth = input.nextInt();
            if(heigth > fence){
                count += 2;
            }
            else{
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
