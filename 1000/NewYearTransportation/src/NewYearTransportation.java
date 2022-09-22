import java.util.HashSet;
import java.util.Scanner;
 
public class NewYearTransportation {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int cells = input.nextInt();
        int destination = input.nextInt();
        
        int[] arr = new int[cells];
        for(int i = 1; i < cells; i++){
            arr[i] = input.nextInt();
        }
 
        HashSet<Integer> visited = new HashSet<Integer>();
        visited.add(1);
 
        int lastVisited = 1;
        while(!visited.contains(destination) && lastVisited < destination){
            lastVisited = lastVisited + arr[lastVisited];
            if(lastVisited == 0){
                lastVisited = cells;
                visited.add(lastVisited);
                lastVisited = 1;
            }
            visited.add(lastVisited);
            
        }
 
        if(visited.contains(destination)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
 
        input.close();
    }
}
