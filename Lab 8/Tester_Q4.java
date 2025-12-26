import java.util.Scanner;
public class Tester_Q4 {
    public static void main(String[] args){
        Fraction fraction = new Fraction();
        fraction.input();
        fraction.display();

    }
    
}

class Fraction{
    int numerator,denominator;

    public void setNumerator(int n){
        this.numerator = n;
    }

    public void setDenominator(int n){
        this.denominator = n;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numerator: ");
        setNumerator(scanner.nextInt());
        System.out.print("Denominator: ");
        setDenominator(scanner.nextInt());
        scanner.close();

    }

    public int GCD(int a,int b){
        if(a%b==0){
            return b;
        }
        return GCD(b,a%b);
    }

    public void display(){
        int divisor = GCD(numerator,denominator);
        System.out.print(numerator/divisor + "/" + denominator/divisor);
    }
    

}
