import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        String s = input.nextLine();
        boolean caps = false;


        if(s.equals(s.toUpperCase())){
            caps = true;
        }
        else if(s.charAt(0) >= 'a' && s.charAt(0) <= 'z'){
            caps = true;
            for(int i = 1; i < s.length(); i++){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    caps = true;
                }
                else{
                    caps = false;
                    break;
                }
            }
        }
        if(caps){
            String res = "";
            String temp = "";
            for(int i = 0; i < s.length(); i++){
                temp += s.charAt(i);
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                    temp = temp.toLowerCase();
                }
                else{
                    temp = temp.toUpperCase();
                }
                res += temp;
                temp = "";
            } 
            System.out.println(res);
        }
        else{
            System.out.println(s);
        }

        input.close();
    }
}
