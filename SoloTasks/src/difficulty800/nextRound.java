package difficulty800;
import java.util.*;;

public class nextRound {
    public static void main(String[] args) throws Exception {
        Scanner unos = new Scanner(System.in);

        int n, k;
        do{
            n = unos.nextInt();
        }while(n < 1 || n > 50);

        do{
            k = unos.nextInt();
        }while(k < 1 || k > n);

        int niz[] = new int[n];
        int brojac = 0;
        int poslednji = -1;

        for(int i = 0; i < niz.length; i++){
            niz[i] = unos.nextInt();
            //System.out.println("brojac pre povecanja: " + brojac);
            if(niz[i] > 0){
                if(brojac < k){
                    brojac++;
                    poslednji = niz[i];
                }
                else if(poslednji == niz[i]){
                    brojac++;
                }
            }
            //System.out.println("brojac posle if-a: " + brojac);
        }
        unos.close();
        System.out.println(brojac);

    }
}
