import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int x = 0, y = 0, z = 0;
        for(int i = 0; i < num * 3; i++){
            if(i % 3 == 0){
                x += input.nextInt();
            }
            else if(i % 3 == 1){
                y += input.nextInt();
            }
            else{
                z += input.nextInt();
            }
        }
        if(x == 0 && y == 0 && z == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }


        input.close();
    }
}
