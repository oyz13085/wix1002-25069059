import java.util.Arrays;
public class Lab_5_Question_3 {
    public static void main(String[] args){
        int N = 20;
        int[][] workHours = new int[N][7];
        int[] totalWorkHours = new int[N];
        
        System.out.print("===Work Hours===");
        
        for(int i = 0; i<N;i++){
            totalWorkHours[i] = 0;
            for(int j = 0; j<7 ; j++){
                workHours[i][j] = (int)(Math.random() * 7) + 1;
                totalWorkHours[i] += workHours[i][j];
            } 
            System.out.print("\nWorker " + (i+1) + ": " + Arrays.toString(workHours[i]) + "   Total Work Hours: " + totalWorkHours[i] + " hours");
        }
        
        
        
    
    }
    
}
