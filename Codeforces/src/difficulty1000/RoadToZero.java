package difficulty1000;

import java.util.Scanner;

public class RoadToZero {
    public static void main(String[] args) throws Exception {
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
                System.out.println(moneySpent);
            }
            else{
                System.out.println(tempMoneySpent);
            }
            i++;
        }

        input.close();
    }
}
