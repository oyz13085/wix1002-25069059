package Lab;

public class Q4 {
    public static void main(String[] args){
        DoubleDiceGame game1 = new DoubleDiceGame();
        game1.game();
    }
    
}

class DiceGame{
    protected int score1 = 0,score2 = 0;

    public int rollDice(){
        return (int)(Math.random()*6+1);
    }

    public void addScore(int a, int player){
        if(player == 1){
            score1 += a;
        }else{
            score2 += a;
        }
    }

    public void addScore(int a,int b,int player){
        if(player == 1){
            score1 += a + b;
        }else{
            score2 += a + b;
        }
    }

    public int getScore(int player){
        if(player == 1){
            return score1;
        }else{
            return score2;
        }
    }

}

class SingleDiceGame extends DiceGame{
    public void game(){
        while(true){
            if(player(1)){
                break;
            }
            if(player(2)){
                break;
            }
        }

    }

    public boolean player(int player){
        int roll = 0;
        int dice;
        do{
            roll++;
            dice = super.rollDice();
            super.addScore(dice,player);
            System.out.println("\nPlayer " + player + " Turn!");
            System.out.println("Dice: " + dice);
            System.out.println("Score: " + super.getScore(player));
            if(super.getScore(player) == 100){
                System.out.println("Player " + player + " wins!");
                return true;
            }else if(super.getScore(player) > 100 || (dice==6 && roll == 2)){
                System.out.println("Dice not counted!");
                super.addScore(-1 * dice,player);
                System.out.println("Score: " + super.getScore(player));
            }else{

            }
            
        }while(dice==6 && roll < 2);    
        return false;
 

    }
}

class DoubleDiceGame extends DiceGame{
    public void game(){
        while(true){
            if(player(1)){
                break;
            }
            if(player(2)){
                break;
            }
        }

    }

    public boolean player(int player){
        int dice1,dice2;
        do{
            dice1 = super.rollDice();
            dice2 = super.rollDice();
            super.addScore(dice1,dice2,player);
            System.out.println("\nPlayer " + player + " Turn!");
            System.out.println("Dice: " + dice1 + " " + dice2);
            System.out.println("Score: " + super.getScore(player));
            if(super.getScore(player) >= 100){
                System.out.println("Player " + player + " wins!");
                return true;
            }       
        }while(dice2==dice1);    
        return false;
 

    }
}