import java.util.Scanner;

public class TernaryString {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int testCasese = input.nextInt();
        input.nextLine();
        while(testCasese > 0){
            String in = input.nextLine();
            int inLen = in.length();
            String pat = "123";
            int patLen = 3;
            if(in.length() < 3){
                System.out.println("0");

            }
            else{
                int hash_pat[] = new int[256];
                int hash_str[] = new int[256];

                for(int i = 0; i < patLen; i++){
                    hash_pat[pat.charAt(i)]++; 
                }

                int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
                int count = 0;
                for(int i = 0; i < inLen; i++){
                    hash_str[in.charAt(i)]++;

                    if(hash_str[in.charAt(i)] <= hash_pat[in.charAt(i)]){
                        count++;
                    }
                    if (count == patLen) {
                        while (hash_str[in.charAt(start)] > hash_pat[in.charAt(start)] || hash_pat[in.charAt(start)] == 0) {
                            if (hash_str[in.charAt(start)]
                                > hash_pat[in.charAt(start)])
                                hash_str[in.charAt(start)]--;
                            start++;
                        }
         
                        int len_window = i - start + 1;
                        if (min_len > len_window) {
                            min_len = len_window;
                            start_index = start;
                        }
                    }
                }
                if(start_index == -1){
                    System.out.println("0");
                }
                else{
                    System.out.println(min_len);
                }

            }
            testCasese--;
        }
        input.close();
    }
}

class List{

    class Element{
        char m;
        Element next;

        public Element(char m, Element next){
            this.m = m;
            this.next = next;
        }

        public Element(char m){
            this(m, null);
        }
    }

    int length;
    Element first, rear;
    boolean contains1;
    boolean contains2;
    boolean contains3;

    public List(){
        this.length = 0;
        this.first = null;
        this.rear = null;
        contains1 = false;
        contains2 = false;
        contains3 = false;
    }

    public void add(char m){
        if(first == null){
            Element added = new Element(m);
            first = added;
            rear = added;
            if(m == '1'){
                contains1 = true;
            }
            else if(m == '2'){
                contains2 = true;
            }
            else if(m == '3'){
                contains3 = true;
            }
            length++;
        }
        else{
            Element added = new Element(m);
            rear.next = added;
            rear = added;
            if(m == '1'){
                contains1 = true;
            }
            else if(m == '2'){
                contains2 = true;
            }
            else if(m == '3'){
                contains3 = true;
            }
            length++;
        }
    }

    public void removeFirst(){
        while(first != rear && first.m == rear.m){
            first = first.next;
            length--;
        }
    }

    public void removeMultiple(){
        while(first != null && first.next != null && first.m == first.next.m){
            first = first.next;
            length--;
        }
    }

    public String toString(){
        String res = "[";
        Element curr = first;
        while(curr != null){
            res += curr.m;
            if(curr.next != null){
                res += " ";
            }
            else{
                res += "]";
            }
            curr = curr.next;
        }
        return res;
    }
}
