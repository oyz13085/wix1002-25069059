import java.io.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new FileInputStream("C:\\Users\\User\\Desktop\\Testing Sample\\test.txt"));
            PrintWriter write = new PrintWriter(new FileOutputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab7\\reverse.txt",true));
            while(input.hasNextLine()){
                String line = input.nextLine();
                char[] word = line.toCharArray();
                for(int i=word.length-1;i>=0;i--){
                    write.print(word[i]);
                }
                write.println();

            }
            input.close();
            write.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
