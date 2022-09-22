import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //trazi se za zadatak 2 ulaza int
        int num = input.nextInt();
        int time = input.nextInt();
        input.nextLine();
        String queue = input.nextLine();
        char[] array = queue.toCharArray();
        
        int count = 0;
        while(count < time){
            for(int i = 0; i < array.length; i++){
                if(i +1 < array.length && array[i] == 'B' && array[i+1] == 'G'){
                    array[i] = 'G';
                    array[i+1] = 'B';
                    i++;
                }
            }
            count++;
        }        
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        input.close();
    }
}
