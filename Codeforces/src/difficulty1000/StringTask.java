package difficulty1000;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        HashSet<Character> vowels = new HashSet<Character>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('Y');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('y');
        vowels.add('u');
        LinkedList<Character> list = new LinkedList<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!vowels.contains(s.charAt(i))){
                list.add('.');
                list.add(s.charAt(i));
            }
        }

        s = "";
        while(!list.isEmpty()){
            s += list.removeFirst();
        }
        System.out.println(s.toLowerCase());
        input.close();
    }
}
