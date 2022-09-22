import java.util.Scanner;

public class CheapTravel {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numberOfRides = input.nextInt();
        int ridesForMTicket = input.nextInt();
        int priceOfOneRide = input.nextInt();
        int priceOfMTicket = input.nextInt();

        int priceOnlyOneRide = 0;
        int priceOnlyMRides = 0;
        int priceCombined = 0;

        priceOnlyOneRide += numberOfRides * priceOfOneRide;
        if(numberOfRides % ridesForMTicket != 0){
            priceOnlyMRides += (numberOfRides / ridesForMTicket + 1) * priceOfMTicket;
        }
        else{
            priceOnlyMRides += numberOfRides / ridesForMTicket * priceOfMTicket;
        }
        
        priceCombined += numberOfRides % ridesForMTicket * priceOfOneRide;
        priceCombined += numberOfRides / ridesForMTicket * priceOfMTicket;

        int min = Math.min(priceCombined, priceOnlyOneRide);
        min = Math.min(min, priceOnlyMRides);
        System.out.println(min);




        input.close();
    }
}
