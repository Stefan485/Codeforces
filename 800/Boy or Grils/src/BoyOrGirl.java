import java.util.Scanner;
import java.util.LinkedList;

public class BoyOrGirl {
    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        Scanner unos = new Scanner(System.in);
        LinkedList<Character> slova = new LinkedList<>();
        String input = "wjmzbmr";
        for(int i = 0; i < input.length(); i++){
            if(!slova.contains(input.charAt(i))){
                slova.add(input.charAt(i));
            }
        }
        if(slova.size() % 2 == 1){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }

        //Lista listaSlova = new Lista();
        /*for(int i = 0; i < input.length(); i++){
            listaSlova.ubaci(input.charAt(i));
        }
        if(listaSlova.brojSlova % 2 == 1){
            System.out.println("IGNORE HIM!");
        }
        else{
            System.out.println("CHAT WITH HER!");
        }*/
        unos.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}


class Lista{

    int brojSlova = 0;
    class Slovo{
        Character info;
        int broj;
        Slovo next;

        public Slovo(Character i){
            this.info = i;
            this.broj = 0;
            this.next = null;
        }

        public Slovo(){
            this(null);
        }
    }

    private Slovo prvoSlovo = null;
    public Lista(){
        prvoSlovo = null;
    }

    public void dodaj(Character info){
        Slovo novo = new Slovo(info);
        novo.next = prvoSlovo;
        prvoSlovo = novo;
        brojSlova++;
    }

    public boolean daLiPostoji(Character info){
        if(prvoSlovo != null){
            Slovo tekuce = prvoSlovo;
            while(tekuce != null && tekuce.info != info){
                tekuce = tekuce.next;
            }
            if(tekuce != null){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public Slovo nadjiRek(Character info){
        return Try(prvoSlovo, info);
    }
    public Slovo Try(Slovo tren, Character info){
        if(tren != null){
            if(tren.info == info){
                return tren;
            }
            else{
                return Try(tren.next, info);
            }
        }
        else{
            return null;
        }
    }

    public void ubaci(Character info){
        if(!daLiPostoji(info)){
            dodaj(info);
        }
    }

    public void ubaciRek(Character info){
        if(nadjiRek(info) == null){
            dodaj(info);
        }
    }
}
