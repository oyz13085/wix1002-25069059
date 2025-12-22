public class Lab_6_Question_2 {
    public static void main(String args[]){
        descending(1,2,3);

    }

    public static void descending(int a,int b,int c){
        int[] answer = new int[]{a,b,c};

        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(answer[i] < answer[j]){
                    int temp = answer[j];
                    answer[j] = answer[i];
                    answer[i] = temp;
                }
            }
        }

        for(int i:answer){
            System.out.print(i + " ");
        }
    }
    
}
