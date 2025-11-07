import java.util.Scanner;

public class Lab_5_Question_6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows of Pascal Triangle to generate: ");
        int rows = scanner.nextInt();
        
        int[][] PasTri = new int[rows][rows];
        
        System.out.println("\nThe Pascal Triangle with " + rows + " rows: ");
        
        for (int i = 0;i<rows;i++){
            PasTri[i][0]=1;
            for(int j=0;j<rows;j++){
                //print zeros
                if(j>i){
                    PasTri[i][j] = 0;       
                }else if(j==i){
                    PasTri[i][j]=1;
                }else{
                    if(i!=0 && j!=0){
                        PasTri[i][j] = PasTri[i-1][j-1] + PasTri[i-1][j];
                    }
                    
                }
                
                System.out.print(PasTri[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        
        
    }
    
}
