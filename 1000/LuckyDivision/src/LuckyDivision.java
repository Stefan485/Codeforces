import java.util.HashSet;
import java.util.Scanner;

public class LuckyDivision {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        boolean lucky = false;

        lucky = nearlyLucky(num);

        if(lucky != true){
            breaking:{
                for(int i = 1; i <= temp / 2; i++){
                    if(temp % i == 0){
                        lucky = nearlyLucky(i);
                        if(lucky){
                            break breaking;
                        }
                    }
                }
            }
        }

        if(lucky){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        input.close();
    }

    static boolean nearlyLucky(int num){
        boolean nearly = false;
        HashSet<Integer> set = new HashSet<Integer>();

        while(num > 0){
            set.add(num % 10);
            num = num / 10;
        }
        if(set.contains(4) && set.contains(7) && set.size() == 2){
            nearly = true;
        }
        else if(set.contains(4) && set.size() == 1){
            nearly = true;
        }
        else if(set.contains(7) && set.size() == 1){
            nearly = true;
        }
        return nearly;
    }
}
