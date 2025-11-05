


public class Lab_4_Question_8 {
    public static void main(String[] args){
        int n = 100;
        int num = 1;
        while(n!=0){
            if((num % 2 != 0 && num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num != 1) || (num == 2 || num == 3 || num == 5 || num == 7)){
                System.out.print(num + " ");
                n--;
            }
            num++;
            
        }
    }
    
   
}
