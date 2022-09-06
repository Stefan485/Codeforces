import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = input.nextInt();

        for(int i = 0; i < counter; i++){
            if(number % 10 == 0){
                number = number / 10;
            }
            else{
                number = number -1;
            }
        }

        System.out.println(number);
        input.close();
    }
}
