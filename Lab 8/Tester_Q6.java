public class Tester_Q6 {
    public static void main(String[] args){
        BurgerStall s1 = new BurgerStall("001",100);
        BurgerStall s2 = new BurgerStall("002",50);
        BurgerStall s3 = new BurgerStall("003",35);
            
        s1.sold(60);
        s2.sold(150);
        s3.sold(75);

        s1.display();
        s2.display();
        s3.display();
        System.out.println("Total Sold: " + BurgerStall.getTotal());


    }


}

class BurgerStall{
    String ID;
    int sold;
    static int total = 0;

    public BurgerStall(String ID,int sold){
        this.ID = ID;
        this.sold = sold;
        total += sold;
    }

    public void sold(int a){
        sold += a;
        total += a;
    }

    public static int getTotal(){
        return total; 
    }

    public String getID(){
        return ID;
    }

    public int getSold(){
        return sold;
    }

    public void display(){
        System.out.println("Stall ID: " + getID() + " Sold: " + getSold());
    }

}