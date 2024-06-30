package difficulty800;
import java.util.Scanner;
import java.util.LinkedList;

public class DivisibilityProblem {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<Integer>();
        int testCases = input.nextInt();
        for(int i = 0; i < testCases; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            if(a % b == 0){
                lista.add(0);
            }
            else{
                lista.add((b - a % b));
            }
        }
        while(!lista.isEmpty()){
            System.out.println(lista.removeFirst());
        }
        input.close();
    }
}
