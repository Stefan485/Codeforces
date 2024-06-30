package difficulty1200;

import java.util.Scanner;

public class TernaryXOR {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        while(testCases > 0){
            String resS = "";
            String resL = "";
            int n = input.nextInt();
            input.nextLine();
            String x = input.nextLine();
            char c[] = x.toCharArray();
            boolean same = true;
            for(int i = 0; i < c.length; i++){
                if(i == 0){
                    switch (c[i]){
                        case '1':
                            resS += '2';
                            resL += '2';
                            break;
                        case '2':
                            resS += '1';
                            resL += '1';
                            break;
                        case '0':
                            resS += '1';
                            resL += '2';
                            same = false;
                            break;
                        default:  
                    }
                }
                else{
                    if(same){
                        switch (c[i]){
                            case '1':
                                resS += '1';
                                resL += '0';
                                same = false;
                                break;
                            case '2':
                                resS += '1';
                                resL += '1';
                                break;
                            case '0':
                                resS += '0';
                                resL += '0';
                                break;
                            default: 
                        }
                    }
                    else{
                        switch (c[i]){
                            case '1':
                                resS += '0';
                                resL += '1';
                                break;
                            case '2':
                                resS += '0';
                                resL += '2';
                                break;
                            case '0':
                                resS += '0';
                                resL += '0';
                                break;
                            default: 
                        }
                    }
                }
            }
            System.out.println(resS);
            System.out.println(resL);
            testCases--;
        }
        input.close();
    }
}
