import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter input = new PrintWriter(new FileOutputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab7\\index.htm",true));
            while(in.hasNextLine()){
                input.print(in.nextLine());
            }
            input.close();

        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }


    }

}
