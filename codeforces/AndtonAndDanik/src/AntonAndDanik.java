import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        String result = input.nextLine();
        int count = 0;
        for(int i = 0; i < num; i++){
            if(result.charAt(i) == 'A'){
                count++;
            }
            else{
                count--;
            }
        }
        if(count > 0){
            System.out.println("Anton");
        }
        else if(count < 0){
            System.out.println("Danik");
        }
        else{
            System.out.println("Friendship");
        }

        input.close();
    }
}
