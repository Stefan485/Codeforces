import java.util.Scanner;

public class petyaAndStrings {
    public static void main(String[] args) throws Exception {
        Scanner unos = new Scanner(System.in);
        String prvi = null;
        String drugi = null;
        do{
            prvi = unos.next();
            unos.nextLine();
        }while(prvi == null || (prvi.length() < 1 || prvi.length() > 100));

        do{
            drugi = unos.next();
            unos.nextLine();
        }while(drugi == null || (drugi.length() < 1 || drugi.length() > 100));

        if(prvi.compareToIgnoreCase(drugi) > 0){
            System.out.println(1);
        }
        else if(prvi.compareToIgnoreCase(drugi) < 0){
            System.out.println(-1);
        }
        else{
            System.out.println(0);
        }
        unos.close();
    }
}
