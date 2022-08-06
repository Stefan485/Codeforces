import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String rez = "";
        int layer = input.nextInt();
        for(int i = 1; i <= layer; i++){
            if(i % 2 == 1){
                if(i < layer){
                    rez += "I hate that ";
                }
                else{
                    rez += "I hate it";
                }
            }
            else{
                if(i < layer){
                    rez += "I love that ";
                }
                else{
                    rez += "I love it";
                }
            }
        }
        System.out.println(rez);

        input.close();
    }
}
