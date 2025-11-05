


public class Lab_4_Question_5 {
    public static void main(String[] args){
        int player1 = 0;
        int player2 = 0;
        int number = 0;
        
        while(true){
            do{
                number = (int)(Math.random()*(6))+1;
                System.out.print("\nPlayer 1 got: " + number);
                player1 += number;
                System.out.print("  Player 1 score: " + player1);
            }
            while(number==6);
            
            if(player1 > 100){
                System.out.println("\nPlayer 1 wins!");
                break;
            }
            
            do{
                number = (int)(Math.random()*(6))+1;
                System.out.print("\nPlayer 2 got: " + number);
                player2 += number;
                System.out.print("  Player 2 score: " + player2);
            }
            while(number==6);
            
            if(player2 > 100){
                System.out.println("\nPlayer 2 wins!");
                break;
            }
            
        }
    }
}
    

