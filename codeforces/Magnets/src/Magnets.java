import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int prvi = 0;
        int count = 0;
        for(int i = 0; i < num; i++){
            int mag = input.nextInt();
            if(prvi == 0){
                prvi = mag;
                count++;
            }
            else if(prvi != mag){
                count++;
                prvi = mag;
            }
        }
        System.out.println(count);
        input.close();
    }
}
