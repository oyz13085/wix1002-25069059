

import java.util.Scanner;

public class Lab_4_Question_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        System.out.print("The factors are: ");
        
        for(int i=1;i<=number;i++){
            if(number%i==0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
    
}
