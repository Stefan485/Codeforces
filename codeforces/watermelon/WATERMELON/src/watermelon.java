import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner unos = new Scanner(System.in);
        do{
            n = unos.nextInt();
        }while(n < 1 || n > 100);
        if(n == 2 || n%2 == 1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
        unos.close();
    }
}
