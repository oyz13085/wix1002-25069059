

import java.util.Scanner;

public class Lab_4_Question_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
    int number = scanner.nextInt();
    int current = 0;
    int sum =0;
    for(int i=0;i<number;i++){
        current += i;
        sum += current;
    }
    System.out.println(sum);
    }
}
    

    

