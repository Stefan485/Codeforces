package difficulty1000;

import java.util.Scanner;

public class MoveBrackets {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();
        int testNum = 0;

        while(testNum < tests){
            int openWithoutClosing = 0;
            int number = input.nextInt();
            input.nextLine();
            String brackets = input.nextLine();
            for(int i = 0; i < number; i++){
                if(brackets.charAt(i) == '('){
                    openWithoutClosing++;
                }
                if(brackets.charAt(i) == ')'){
                    if(openWithoutClosing > 0){
                        openWithoutClosing--;
                    }
                }
            }
            System.out.println(openWithoutClosing);
            testNum++;
        }


        input.close();
    }
}
