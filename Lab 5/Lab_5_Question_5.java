import java.util.Scanner;

public class Lab_5_Question_5 {
    public static void main(String[] args){
        int[] numbers = new int[20];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("A list of 20 random integer ranging from 0 to 100:");
        for(int i = 0; i<20; i++){
            numbers[i] = (int)(Math.random()* 101);
            System.out.print(numbers[i] + " ");
        }
        
        int max = 0,index=0;
        
        System.out.println("\nArray in descending order: ");
        
        for(int i = 0; i<20; i++){
            max = numbers[i];
            index = i;
            for(int j=i;j<20;j++){    
                if(max<numbers[j]){
                    max = numbers[j];
                    index = j;
                }
            }
            numbers[index] = numbers[i];
            numbers[i] = max;
            System.out.print(numbers[i] + " ");
        
            }
        
        System.out.print("\nEnter a number: ");
        int number = scanner.nextInt();
        boolean found = false;
        int loop=0;
        
        //binary search
        for(int i=0;i<20;i++){
            loop++;
            if(number == numbers[i]){
                System.out.println("\n" + number + " found.");
                found = true;
                break;
            }
            
        }
        
        if(!found){
            System.out.println("\n" + number + " not found.");
        }
        
        System.out.println("Linear Search - " + loop + " loop(s) ");
        
        //binary search
        int low = 0;
        int high = numbers.length-1;
        int mid;
        loop = 0;
        found = false;
        
        while(low<=high){
            mid = (high+low)/2;
            loop++;
            if(numbers[mid] > number){
                low = mid + 1;
            }else if(numbers[mid] < number){
                high = mid - 1;
            }else{
                System.out.println("\n" + number + " found.");
                found = true;
                break;
            }
        }
        
        
        if(!found){
            System.out.println("\n" + number + " not found.");
        }        
        System.out.println("Binary Search - " + loop + " loop(s) ");
        
        
        
        
        
        
        
    
    
        
       
 }
}
    

