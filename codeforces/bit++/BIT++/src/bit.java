import java.util.Scanner;

public class bit{
    public static void main(String[] args) throws Exception {
        int x = 0, n;
        Scanner unos = new Scanner(System.in);
        do{
            n = unos.nextInt();
            unos.nextLine();
        }while(n < 0 || n > 150);
        unos.reset();

        for(int i = 0; i < n; i++){
            String statement = unos.nextLine();
            if(statement != null && statement.charAt(1) == '+'){
                x++;
            }
            else{
                x--;
            }
        }
        unos.close();
        System.out.println(x);
    }
}
