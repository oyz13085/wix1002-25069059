

import java.util.Scanner;

public class Lab_4_Question_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year;
        int firstDay; //0 = Sunday
        
        System.out.print("Enter your year: ");
        year = scanner.nextInt();
        
        System.out.print("Enter the first day of the year: ");
        firstDay = scanner.nextInt();
        
        int daysMay,daysAugust;
        
        if((year%4==0 && year%100!=0) || year%400==0){
            //leap year
            daysMay = 121;
            daysAugust = 213;
            
        }else{
            daysMay = 120;
            daysAugust = 212;
        }
        
        int firstdayAtMay = (daysMay%7 + firstDay) %7 ;
        int firstdayAtAugust = (daysAugust%7 + firstDay) %7;
        
        System.out.println(firstdayAtMay);
        
        System.out.println("======May " + year + "======");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        
        for(int i=0;i<firstdayAtMay;i++){
            System.out.print(" \t");
        }
      
        int j=1;
        
        for(int i=firstdayAtMay;i<7;i++){
            System.out.print(j+"\t");
            j++;
        }
        
        System.out.println();
        
        int row = 0;
        
        while(j<=31){
            System.out.print(j+"\t");
            row++;
            j++;
            if(row==7){
                System.out.println();
                row=0;
            }
        }
        
        System.out.println();
        
        System.out.println("======August " + year + "======");
        System.out.println("S\tM\tT\tW\tT\tF\tS");
        
        for(int i=0;i<firstdayAtAugust;i++){
            System.out.print(" \t");
        }
      
        j=1;
        
        for(int i=firstdayAtAugust;i<7;i++){
            System.out.print(j+"\t");
            j++;
        }
        
        System.out.println();
        
        row = 0;
        
        while(j<=31){
            System.out.print(j+"\t");
            row++;
            j++;
            if(row==7){
                System.out.println();
                row=0;
            }
        }
        
        
        
        
        
    }
    
}
