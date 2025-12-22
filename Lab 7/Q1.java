import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab7\\coursename.dat"));
            out.writeUTF("WXES1116");
            out.writeUTF("Programming I");
            out.writeUTF("WXES1115");
            out.writeUTF("Data Structure");
            out.writeUTF("WXES1110");
            out.writeUTF("Operating System");
            out.writeUTF("WXES1112");
            out.writeUTF("Computing Mathematics");
            out.close();


        }catch(IOException e){
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course Code: ");
        String courseCode = input.nextLine();

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab7\\coursename.dat"));
            String word;
            while(true){
                word = in.readUTF();
                if(word.equals(courseCode)){
                    System.out.println("Course Code: "+in.readUTF());
                    break;
                }
            }

        }catch(EOFException e){
            System.out.println("Course not found");
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
