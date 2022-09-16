import java.util.Scanner;

public class OddSelection {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while(testCases > 0){
            int numbers = input.nextInt();
            int chosen = input.nextInt();
            int even = 0;
            int odd = 0;
            int evenInSum = 0;
            int oddInSUm = 0;
            for(int i = 0; i < numbers; i++){
                int in = input.nextInt();
                if(in % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            if(odd + even < chosen || odd == 0){
                System.out.println("NO");
            }
            else{
                if(chosen <= even){
                    evenInSum = chosen;
                }
                else{
                    evenInSum = even;
                }
                if(evenInSum == chosen){
                    System.out.println("YES");
                }
                else{
                    if((chosen - evenInSum) % 2 == 0){
                        oddInSUm = chosen - evenInSum + 1;
                    }
                    else{
                        oddInSUm = chosen - evenInSum;
                    }
                    if(oddInSUm > odd || oddInSUm > chosen){
                        System.out.println("NO");
                    }
                    else{
                        System.out.println("YES");
                    }
                }
            }
            testCases--;
        }
        input.close();
    }
}
