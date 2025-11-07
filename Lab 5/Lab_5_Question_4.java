
public class Lab_5_Question_4 {
    public static void main(String[] args){
        int[][] matrix = {{1,5,7},{3,6,9},{5,3,8}};
        int[][] resultMatrix = new int[3][3];
        int n=0,z=0;
    
        for(int i = 2;i>=0;i--){
            
            for(int j = 0;j<3;j++){
               
                resultMatrix[j][i]=matrix[n][j];
                System.out.print(matrix[n][j] + " ");
            }
            n++;
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        
    }
    
}
