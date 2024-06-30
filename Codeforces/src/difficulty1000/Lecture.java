package difficulty1000;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int wordsInLecture = input.nextInt();
        int numberOfWordsInLanguage = input.nextInt();
        input.nextLine();

        String[][] array = new String[numberOfWordsInLanguage][2];
        for(int i = 0; i < array.length; i ++){
            String line = input.nextLine();
            String[]split = line.split(" ");
            array[i][0] = split[0];
            array[i][1] = split[1];
        }

        String lecture = input.nextLine();
        String[] splitLecture = lecture.split(" ");

        String res = "";

        for(int i = 0; i < splitLecture.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j][0].equals(splitLecture[i]) || array[j][1].equals(splitLecture[i])){
                    if(array[j][1].length() >= array[j][0].length()){
                        res += array[j][0];
                    }
                    else{
                        res += array[j][1];
                    }
                    if(i + 1 != splitLecture.length){
                        res += " ";
                    }
                    break;
                }
            }
        }
        System.out.println(res);
        input.close();
    }
}
