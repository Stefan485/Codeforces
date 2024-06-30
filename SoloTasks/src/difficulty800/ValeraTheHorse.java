package difficulty800;
import java.util.HashSet;
import java.util.Scanner;

public class ValeraTheHorse {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<Integer>();
        int brojac = 0;
        for(int i = 0; i < 4; i++){
            int in = input.nextInt();
            if(set.contains(in)){
                brojac++;
            }
            else{
                set.add(in);
            }
        }
        System.out.println(brojac);
        input.close();
    }
}
