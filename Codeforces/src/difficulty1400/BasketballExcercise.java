package difficulty1400;
import java.util.Scanner;

public class BasketballExcercise {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        int numberOfPlayers = reader.nextInt();
        long[] arr1 = new long[numberOfPlayers + 1];
        long[] arr2 = new long[numberOfPlayers + 1];
 
        for(int i = 1; i <= numberOfPlayers; i++) {
            arr1[i] = reader.nextLong();
        }

        for(int i = 1; i <= numberOfPlayers; i++) {
            arr2[i] = reader.nextLong();
        }

        long[][] dp = new long[numberOfPlayers + 1][2];
        

        for(int i = 1; i <= numberOfPlayers; i++) {
            dp[i][0] = Math.max(dp[i - 1][1] + arr1[i], dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i - 1][0] + arr2[i], dp[i - 1][1]);
        }

        System.out.println(Math.max(dp[numberOfPlayers][0], dp[numberOfPlayers][1]));
        reader.close();
    }
}
