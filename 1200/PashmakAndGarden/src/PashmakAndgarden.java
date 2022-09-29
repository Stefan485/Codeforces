import java.util.Scanner;

public class PashmakAndgarden {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = 0, x4 = 0, y3 = 0, y4 = 0;

        if(x1 == x2){
            y3 = y1;
            x3 = x1 + Math.abs(y2-y1);
            y4 = y2;
            x4 = x3;
            System.out.print(x3 + " " + y3 + " ");
            System.out.println(x4 + " " + y4);
        }
        else if(y1 == y2){
            x3 = x1;
            y3 = y1 + Math.abs(x1 - x2);
            x4 = x2;
            y4 = y3;
            System.out.print(x3 + " " + y3 + " ");
            System.out.println(x4 + " " + y4);
        }
        else{
            x3 = x1;
            y3 = y2;
            x4 = x2;
            y4 = y1;
            if(Math.abs(y3-y1) == Math.abs(y4-y2) && Math.abs(x4-x1) == Math.abs(x3-x2) && Math.abs(y3-y1) == Math.abs(x4-x1)){
                System.out.print(x3 + " " + y3 +" ");
                System.out.println(x4 + " " + y4);
            }
            else{
                System.out.println(-1);
            }
        }

        input.close();
    }
}
