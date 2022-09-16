import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        long copy = 0;
        long i = 0;
        while(number > 0){
            Long digit = number % 10;
            if(9 - digit <= digit){
                if(number / 10 == 0 && 9 - digit == 0){
                    if(i == 0){
                        copy += digit;
                    }
                    else{
                        copy += i * 10 * digit;
                    }
                }
                else{
                    if(i == 0){
                        copy += (9 - digit);
                    }
                    else{
                        copy += i * 10 * (9 - digit);
                    }
                }
            }
            else{
                if(i == 0){
                    copy += digit;

                }
                else{
                    copy += i * 10 * digit;
                }
            }

            if(i == 0){
                i++;
            }
            else{
                i = i * 10;
            }
            number = number / 10;
        }
        System.out.println(copy);

        input.close();
    }
}
