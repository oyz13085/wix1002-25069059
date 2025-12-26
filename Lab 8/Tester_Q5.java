public class Tester_Q5 {
    public static void main(String[] args){
        Game p1 = new Game("Ooi");
        Game p2 = new Game("Lim");

        while(true){
            p1.rollDice();
            System.out.println("P1: " + p1.getAmount());
            if(p1.getAmount() >= 100){
                System.out.println("P1 wins");
                break;
            }
            p2.rollDice();
            System.out.println("P2: " + p2.getAmount());
            if(p2.getAmount() >= 100){
                System.out.println("P2 wins");
                break;
            }
        }

    }
}

class Game{
    String name;
    int dice;

    public Game(String name){
        this.name = name;
        this.dice = 0;
    }

    public int getAmount(){
        return dice;
    }

    public void rollDice(){
        dice += (int)(Math.random()*6)+1;
    }
}
