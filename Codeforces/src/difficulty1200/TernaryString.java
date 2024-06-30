package difficulty1200;

import java.util.Scanner;

public class TernaryString {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int testCasese = input.nextInt();
        input.nextLine();
        while(testCasese > 0){
            String in = input.nextLine();
            int inLen = in.length();
            String pat = "123";
            int patLen = 3;
            if(in.length() < 3){
                System.out.println("0");

            }
            else{
                int hash_pat[] = new int[256];
                int hash_str[] = new int[256];

                for(int i = 0; i < patLen; i++){
                    hash_pat[pat.charAt(i)]++; 
                }

                int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
                int count = 0;
                for(int i = 0; i < inLen; i++){
                    hash_str[in.charAt(i)]++;

                    if(hash_str[in.charAt(i)] <= hash_pat[in.charAt(i)]){
                        count++;
                    }
                    if (count == patLen) {
                        while (hash_str[in.charAt(start)] > hash_pat[in.charAt(start)] || hash_pat[in.charAt(start)] == 0) {
                            if (hash_str[in.charAt(start)]
                                > hash_pat[in.charAt(start)])
                                hash_str[in.charAt(start)]--;
                            start++;
                        }
         
                        int len_window = i - start + 1;
                        if (min_len > len_window) {
                            min_len = len_window;
                            start_index = start;
                        }
                    }
                }
                if(start_index == -1){
                    System.out.println("0");
                }
                else{
                    System.out.println(min_len);
                }

            }
            testCasese--;
        }
        input.close();
    }
}