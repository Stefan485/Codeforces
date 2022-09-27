import java.util.Scanner;

/* 
 *  parne mogu praviti od parnih, i parnog broja neparnih
 *  neparne mogu praviti od neparnog broja neparnih
 *
 *paran od parnih
 * ako je broj/2 >= k moze
 *
 *paran od neparnih
 *  ako je broj = k moze (sve jedinice) ili od parnog broja neparnih
 *
 *neparan od neparnih
 *  ako je broj iste parnosti kao k i broj je >= k
 *  
 */

public class SameParitySummands {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t > 0){
            int number = input.nextInt();
            int k = input.nextInt();
            boolean possible = false;
            if(number >= k){
                if(number % 2 == 0){
                    int numberOf2 = number / 2;
                    if(!(numberOf2 < k)){
                        possible = true;
                        System.out.println("YES"); 
                        System.out.print(number - (k-1) * 2 + " ");
                        for(int i =0; i< k-1; i++){
                            System.out.print(2 + " ");
                        }
                        System.out.println();
                    }
                    if(!possible){
                        if(number % 2 == k % 2){
                            possible = true;
                            System.out.println("YES");
                        
                            System.out.print(number - k + 1 + " ");
                            for(int i =0; i< k-1; i++){
                                System.out.print(1 + " ");
                            }
                            System.out.println();
                        }
                    }
                    if(possible == false){
                        System.out.println("NO");
                    }
                }
                else{
                    if(number % 2 == k % 2 && number >= k){
                        possible = true;
                        System.out.println("YES");
                    }
                    if(possible){
                        System.out.print(number - k + 1 + " ");
                        for(int i =0; i< k-1; i++){
                            System.out.print(1 + " ");
                        }
                        System.out.println();
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
        input.close();
    }
}