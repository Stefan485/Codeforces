import java.util.Scanner;
//import java.util.Arrays;
import java.util.LinkedList;;


public class helpfulMaths {
    public static void main(String[] args) throws Exception {
        Scanner unos = new Scanner(System.in);
        LinkedList<Integer> lista = new LinkedList<Integer>();

        String prvi = unos.nextLine();
        //int niz[] = new int[prvi.length()];
        int brojac = 0;
        String pomocni = "";
        while(brojac < prvi.length()){
            if(prvi.charAt(brojac) != '+'){
                pomocni += prvi.charAt(brojac);  
            }
            else{
                if(pomocni != null && !pomocni.equals("")){
                    lista.add(Integer.parseInt(pomocni));
                    //niz[brojac] = Integer.parseInt(pomocni);
                    pomocni = "";
                }
            }
            brojac++;
        }
        lista.add(Integer.parseInt(pomocni));
        //niz[brojac-1] = Integer.parseInt(pomocni);
        //sortiranje ispravi permutacije
        /*for(int i = 0; i < niz.length; i++){
            for(int j = i+1; j < niz.length; j++){
                if(niz[i] > niz[j]){
                    int pomocna = niz[j];
                    niz[j] = niz[i];
                    niz[i] = pomocna;

                }
            }
        }*/
        //Arrays.sort(niz);
        lista.sort(null);
        String rez = "";
        /*for(int i = 0; i < niz.length; i++){
            if(niz[i] != 0){
                rez += niz[i];
                if(i + 1 != niz.length){
                    rez += "+";
                }
            }
        }*/
        while(lista.peekFirst() != null){
            rez += lista.removeFirst();
            if(lista.peekFirst() != null){
                rez += "+";
            }
        }
    
        System.out.println(rez);
        unos.close();
    }
}
