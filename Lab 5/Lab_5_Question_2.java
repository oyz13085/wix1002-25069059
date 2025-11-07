
public class Lab_5_Question_2 {
    public static void main(String[] args){
        int noOfNumbers = 0;
        int number;
        int[] exist = new int[10];
        boolean reject = false;
        
        while(noOfNumbers<10){
            reject = false;
            number = (int)(Math.random() * 20) + 1;
            for(int i=0;i<exist.length;i++){
                if(exist[i] == number){
                    i=exist.length;
                    reject = true;
                }
            }
            
            if(reject!=true){
                exist[noOfNumbers] = number;
                noOfNumbers++;
                System.out.println(number);
            }
            
            
        }
    }
    
}
