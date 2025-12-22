import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        try{
            Scanner product = new Scanner(new FileInputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab07\\product.txt"));
            String[] orders;

            System.out.printf("%-20s\t%-20s\t%20s\t%20s\t%20s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");

            while(product.hasNextLine()){
                Scanner order = new Scanner(new FileInputStream("C:\\Users\\User\\Desktop\\Testing Sample\\Lab07\\order.txt"));

                String[] details = product.nextLine().split(",");
                String id = details[0];
                String name = details[1];
                double price = Double.parseDouble(details[2]);
                int quantity = 0;

                while(order.hasNextLine()){
                    orders = order.nextLine().split(",");
                    if(orders[1].contains(id)){
                        quantity += Integer.parseInt(orders[2]);
                    }
                }

                if(quantity > 0){
                    System.out.printf("%-20s\t%-20s\t%20d\t%20.2f\t%20.2f\n",id,name,quantity,price,quantity*price);
                }

            }


        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
