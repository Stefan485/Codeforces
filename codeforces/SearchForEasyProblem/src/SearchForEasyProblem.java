import java.util.Scanner;

public class SearchForEasyProblem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean hard = false;
        for(int i = 0; i < num; i++){
            int oppinion = input.nextInt();
            if(oppinion != 0){
                hard = true;
            }
        }
        if(hard){
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }

        input.close();
    }
}
