import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int startYear = input.nextInt();
        boolean bjutiful = false;
        HashSet<Integer> set = new HashSet<Integer>();
        for(startYear++; !bjutiful; startYear++){
            int divided = startYear;
            while(divided > 0){
                if(!set.contains(divided % 10)){
                    set.add(divided % 10);
                }
                divided = divided / 10;
            }
            if(set.size() == 4){
                bjutiful = true;
            }
            else{
                set.clear();
            }
        }
        System.out.println(startYear-1);
        input.close();
    }
}
