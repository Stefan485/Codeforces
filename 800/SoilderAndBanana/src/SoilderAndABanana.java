import java.util.Scanner;

public class SoilderAndABanana {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int costOfFirstBanana, soildersMoney, amountOfBananas;
       
        costOfFirstBanana = input.nextInt();

        soildersMoney = input.nextInt();
  
        amountOfBananas = input.nextInt();

        int price = 0;
        for(int i = 1; i <= amountOfBananas; i++){
            price = costOfFirstBanana * i;
            soildersMoney = soildersMoney - price;
        }
        
        if(soildersMoney >= 0){
            System.out.println(0);
        }
        else{
            System.out.println(Math.abs(soildersMoney));
        }

        input.close();
    }
}
