


public class Lab_4_Question_6 {
    public static void main(String[] args){
        int digit = 0;
        int number = (int)(Math.random() * (9999999))+1;
        System.out.println(number);
        
        while(number!=0){
            number/=10;
            digit++;
        }
        
        System.out.println(digit);
        
    }
    
}
