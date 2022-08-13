import java.text.DecimalFormat;
import java.util.Scanner;

public class XeniaAndRingroad {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(0);
        df.setGroupingUsed(false);
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        double timer = 0;
        int lastHouse = 1;
        int task = 1;

        for(int i = 0; i < m; i++){
            task = input.nextInt();
            if(task > lastHouse){
                timer += task - lastHouse;
                lastHouse = task;
            }
            else if(task < lastHouse){
                timer += n - lastHouse + task;
                lastHouse = task;
            }
        }

        System.out.println(df.format(timer));
        input.close();
    }
}
