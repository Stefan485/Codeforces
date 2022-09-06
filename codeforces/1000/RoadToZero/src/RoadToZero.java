import java.text.DecimalFormat;
import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat();
        df.setGroupingUsed(false);
        Scanner input = new Scanner(System.in);
        long testCases = input.nextInt();
        long i = 0;
        while(i < testCases){
            long x = input.nextLong();
            long y = input.nextLong();
            long tempX = x;
            long tempY = y;
            
            long a = input.nextLong();
            long b = input.nextLong();

            long moneySpent = 0;
            long tempMoneySpent = moneySpent;
            //razliku samo spustim za b, ili dok manji nije 0
            
            //kada se koristi povecavanje/smanjivanje oba broja odjednom
            if(x != y){
                long diff;
                if(x > y){
                    diff = x - y;
                    x = y;
                }
                else{
                    diff = y- x;
                    y = x;
                }
                moneySpent += a * diff;
            }
            moneySpent += b * x;

            //kada se ne koristi povecivanje/smanjivanje oba broja istovremeno
            tempMoneySpent += a * tempX;
            tempMoneySpent += a * tempY;
            if(moneySpent < tempMoneySpent){
                System.out.println(df.format(moneySpent));
            }
            else{
                System.out.println(df.format(tempMoneySpent));
            }
            i++;
        }

        input.close();
    }
}
