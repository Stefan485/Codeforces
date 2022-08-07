import java.util.Scanner;

public class InsomniaCure {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int l = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int dragons = input.nextInt();
        int count = 0;

        for(int i = 1; i <= dragons; i++){
            if(i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0){
                count++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
