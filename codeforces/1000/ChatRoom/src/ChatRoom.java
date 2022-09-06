import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int[] arr = {-1, -1, -1, -1, -1};

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'h'){
                arr[0] = i;
                break;
            }
        }
        for(int i = arr[0] + 1; i < s.length(); i++){
            if(s.charAt(i) == 'e'){
                arr[1] = i;
                break;
            }
        }
        for(int i = arr[1] + 1; i < s.length(); i++){
            if(s.charAt(i) == 'l'){
                arr[2] = i;
                break;
            }
        }
        for(int i = arr[2] + 1; i < s.length(); i++){
            if(s.charAt(i) == 'l'){
                arr[3] = i;
                break;
            }
        }
        for(int i = arr[3] + 1; i < s.length(); i++){
            if(s.charAt(i) == 'o'){
                arr[4] = i;
                break;
            }
        }

        boolean possible = true;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] >= arr[i + 1]){
                possible = false;
            }
        }
        if(possible){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        input.close();
    }
}
