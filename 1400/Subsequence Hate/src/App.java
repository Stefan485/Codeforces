import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(in.readLine().trim());
        
        while(testCases-- > 0) {
            char[] chars = in.readLine().trim().toCharArray();
            int one = 0;
            int zero = 0;
            for(char c : chars) {
                if(c == '0') zero++; 
                else one++;
            }

            int res = Math.min(zero, one);
            int curr0 = 0, curr1 = 0;

            for(int i = 0; i < chars.length; i++) {
                if(chars[i] == '0') curr0++;
                else curr1++;

                res = Math.min(res, Math.min(curr1 + zero - curr0, curr0 + one - curr1));
            }

            System.out.println(res);
        }
    }
}

