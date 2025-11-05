

import java.util.Scanner;

public class Lab_4_Question_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int data;
        int min = 99999, max=0, sum=0, n=0, sumsquared=0;
        
        do{
            System.out.print("Enter a score [negative score to quit]: ");
            data = scanner.nextInt();
            if(min>data&&data>0){
                min = data;
            }
            if(max<data&&data>0){
                max = data;
            }
            sum+=data;
            sumsquared+=data*data;
            n++;
           
        }while(data>=0);
        
        System.out.println(sum);
        System.out.println("Minimum Score: " + min);
        System.out.println("Maximum Score: " + max);
        
        double average = (double)sum/n;
        System.out.println("Average Score: " + average);
        
        double stddev = Math.sqrt((sumsquared - (sum*sum)/n)/(n-1));
        System.out.printf("Standard Deviation: %.2f" , stddev);
        
        
        
    }
    
}
