import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr1 = new int[len + 1];
        int[] arr2 = new int[len + 1];
        int[] pos1 = new int[len + 1];
        int[] pos2 = new int[len + 1];

        for(int i = 1; i <= len; i++) {
            int k = in.nextInt();
            arr1[i] = k;
            pos1[k] = i;
        }

        for(int i = 1; i <= len; i++) {
            int k = in.nextInt();
            arr2[i] = k;
            pos2[k] = i;
        }
        
        in.close();
        HashMap<Integer, Integer> dists = new HashMap<>();

        for(int i = 1; i <= len; i++) {
            int dist = pos1[arr1[i]] - pos2[arr1[i]];

            if(dist < 0) dist += len;
            Integer get = dists.get(dist);
            if(get == null) {
                dists.put(dist, 1);
            } else {
                dists.replace(dist, get + 1);
            }
        }

        int max = 0;
        for(Integer curr : dists.keySet()) {
            int temp = dists.get(curr);
            if(temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}
