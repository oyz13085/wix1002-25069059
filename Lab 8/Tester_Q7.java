public class Tester_Q7 {
    public static void main(String[] args){
        Money money1 = new Money(100.18);
        money1.display();

        Money money2 = new Money(50.53);
        money2.display();

        money1.addition(money2);
        money1.subtraction(money2);
    }
    
}

class Money{
    double amount;
    double remaining;

    public Money(double amount){
        this.amount = rounding(amount);
        this.remaining = this.amount;
    }

    public double rounding(double a){
        int check = (int)(a*100)%10;
        if(check<=2){
            amount =  (a*100 - check)/100;
        }else if(check >=3 && check <=7){
            amount =  (a*100 - check + 5)/100;
        }else{
            amount =  (a*100 - check + 10)/100;
        }
        return amount;
    }

    public void splitCash(int a){
        if((int)remaining/a != 0){
            System.out.printf("RM%d: %d\n",a,(int)remaining/a);
            remaining -= (int)(remaining/a) * a;
        }
    }

    public void splitCash(double a){
        if((int)(remaining/a) != 0){
            System.out.printf("RM%.2f: %d\n",a,(int)(remaining/a));
            remaining -= (int)(remaining/a) * a;
        }
    }

    public void display(){
        int[] notes = new int[]{100,50,10,5,1};
        double[] coins = new double[]{0.50,0.20,0.10,0.05};

        System.out.printf("Money: RM%.2f\n",amount);

        for(int i:notes){
            splitCash(i);
        }
        for(double i:coins){
            splitCash(i);
        }

    }

    public void addition(Money money){
        System.out.printf("RM%.2f + RM%.2f = RM%.2f\n",amount,money.amount,amount+money.amount);
    }

    public void subtraction(Money money){
        System.out.printf("RM%.2f - RM%.2f = RM%.2f\n",amount,money.amount,amount-money.amount);
    }
}