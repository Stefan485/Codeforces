import java.util.Scanner;

public class dominos {
    public static void main(String[] args) throws Exception {
        int n, m;
        Scanner unos = new Scanner(System.in);
        do{
            m = unos.nextInt();
        }while(m < 1 || m > 16);

        do{
            n = unos.nextInt();
        }while(n < 1 || n < m);

        int rezultat = n*m;
        System.out.println(rezultat/2);
        unos.close();
    }
}
