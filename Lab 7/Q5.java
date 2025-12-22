import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab07\\person.dat"));

            int nofRecords = input.readInt();
            while(nofRecords-->0)
            {
                String name = input.readUTF();
                int age = input.readInt();
                char gender = input.readChar();

                System.out.println(name + " " + age + " " + gender);
            }

            input.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }

}
