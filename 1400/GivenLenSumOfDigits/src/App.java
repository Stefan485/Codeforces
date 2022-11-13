import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int lenOfNumber = in.nextInt();
        int SumOfDIgits = in.nextInt();
 
        if(lenOfNumber == 1){
            if(SumOfDIgits > 9){
                System.out.println("-1 -1");
                in.close();
                return;
            }
 
            System.out.println(SumOfDIgits + " " + SumOfDIgits);
            in.close();
            return;
        }
 
        if(SumOfDIgits == 0){
            System.out.println("-1 -1");
            in.close();
            return;
        }
 
        if(lenOfNumber * 9 < SumOfDIgits){
            System.out.println("-1 -1");
            in.close();
            return;
        }
 
        if(SumOfDIgits < 10){
            String smal = 1 + "";
            for(int i = 1; i < lenOfNumber - 1; i++){
                smal += 0;
            }
            smal += (SumOfDIgits - 1);
 
            String larg = SumOfDIgits + "";
            for(int i = 1; i < lenOfNumber; i++){
                larg += 0;
            }
 
            System.out.println(smal + " " + larg);
            in.close();
            return;
        }

        int temp = SumOfDIgits;
        String smal = "";
        int counter = 0;

        while(temp - 9 > 0){
            smal += "9";
            temp -= 9;
            counter++;
        }
        if(lenOfNumber - counter == 1){
            smal = temp + smal;
        } else {
            String t = "1";
            smal = (temp - 1) + smal;
            counter += 2;
            for(int i = 1; i <= (lenOfNumber - counter); i++){
                t += 0;
            }
            smal = t + smal;
        }
        String larg = "";
        counter = 0;
        while(SumOfDIgits - 9 > 0){
            larg += 9;
            SumOfDIgits -= 9;
            counter++;
        }
        larg += SumOfDIgits;
        counter++;
        for(int i = 1; i <= (lenOfNumber - counter); i++){
            larg += 0;
        }
        System.out.println(smal + " " + larg);
        
        in.close();
    }
}