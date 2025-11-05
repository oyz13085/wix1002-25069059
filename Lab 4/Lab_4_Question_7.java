

import java.util.Scanner;

public class Lab_4_Question_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int principal,noOfMonths;
        double interest, monthlyPay, Cn, Ln, Rn, totalInterest = 0;
        
        System.out.print("Enter principal amount: RM");
        principal = scanner.nextInt();
        System.out.print("Enter interest in %: ");
        interest = scanner.nextDouble();
        System.out.print("Enter total number of months: ");
        noOfMonths = scanner.nextInt();
        
        monthlyPay = (principal*interest/1200)/(1-Math.pow((1+interest/1200),-noOfMonths));
        
        System.out.printf("Month\t%1$-15s\t%2$-15s\t%3$-15s\t%4$-15s\t%5$-15s\n","Monthly Payment", "Principal", "Interest", "Unpaid Balance","Total Interest");
        
        for(int i=1;i<=noOfMonths;i++){
            Cn = monthlyPay * Math.pow((1+interest/1200),-(1+noOfMonths-i));
            Ln = monthlyPay - Cn;
            Rn = Ln/(interest/1200) - Cn;
            totalInterest += Ln;
            
            System.out.printf(i+"\t%1$-13.2f\t%2$-13.2f\t%3$-13.2f\t%4$-13.2f\t%5$-13.2f\n",monthlyPay,Cn,Ln,Rn,totalInterest);
          
        }
        
        
        
    }
    
}
