import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        try{
            int noOfChar = 0, noOfWords = 0, noOfLines = 0;
            String[] words;

            Scanner input =  new Scanner(new FileInputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab7\\words.txt"));
            while(input.hasNextLine()){
                String line = input.nextLine();
                noOfLines ++;

                words = line.split(" ");

                for(String word : words){
                    noOfWords ++;
                    noOfChar += word.length();

                }

                System.out.println(Arrays.toString(words));


            }

            System.out.println("The number of characters in the file is: " + noOfChar);
            System.out.println("The number of words in the file is: " + noOfWords);
            System.out.println("The number of lines in the file is: " + noOfLines);


        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
