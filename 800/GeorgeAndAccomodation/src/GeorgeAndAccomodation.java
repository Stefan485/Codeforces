import java.util.Scanner;

public class GeorgeAndAccomodation {
    public static void main(String[] args) throws Exception {   
        Scanner input = new Scanner(System.in);
        int rooms = input.nextInt();
        int count = 0;
        for(int i = 0; i < rooms; i++){
            int current = input.nextInt();
            int capacity = input.nextInt();
            if(capacity - current >= 2){
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
