public class Tester_Q2 {
    public static void main(String[] args){
        BankAccount acc = new BankAccount("Ooi Yong Zhe", "0123456789",100);

        acc.deposit(100);
        acc.withdraw(150);
        System.out.printf("Current Balance: RM%.2f",acc.getBalance());
    }
    
}

class BankAccount{
    String name, ic;
    double amount;

    public BankAccount(String name, String ic, double deposit){
        this.name = name;
        this.ic = ic;
        this.amount = deposit;
        System.out.println("Name: " + name);
        System.out.println("IC/Passport: " + ic);
        System.out.printf("Initial Balance: RM%.2f\n",amount);
        System.out.println("Bank Account Opened Successfully!");
    }

    public double getBalance(){
        return amount;
    }

    public void deposit(double deposit){
        this.amount =  amount + deposit;
    }

    public void withdraw(double withdraw){
        this.amount = amount - withdraw;
    }
    

}
