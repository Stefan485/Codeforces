package difficulty800;
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int levels = input.nextInt();
        int x = input.nextInt();

        for(int i = 0; i < x; i++){
            set.add(input.nextInt());
        }
        x = input.nextInt();
        for(int i = 0; i < x; i++){
            set.add(input.nextInt());
        }
        if(set.size() < levels){
            System.out.println("Oh, my keyboard!");
        }
        else{
            System.out.println("I become the guy.");
        }
        input.close();
    }
}
