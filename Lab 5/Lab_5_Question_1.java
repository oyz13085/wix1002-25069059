import java.util.Arrays;

public class Lab_5_Question_1 {
    public static void main(String[] args){
        int N = 50, max = 0, min = 9999, total=0;
        int[] scores = new int[N];
        int tempScore;
        
        for(int i=0;i<N;i++){
            tempScore = (int)(Math.random() * 100) + 1;
            if(tempScore > max){
                max = tempScore;
            }
            if(tempScore < min){
                min = tempScore;
            }
            scores[i] = tempScore;
            total += tempScore;
        }
        
        System.out.println("List of Score: " + Arrays.toString(scores));
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        
        double average = (double) total / N;
        
        System.out.printf("Average Score: %.2f\n" , average);
    }
    
}
