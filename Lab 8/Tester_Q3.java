import java.util.Scanner;
public class Tester_Q3 {
    public static void main(String[] args){
        WeightCalculator cal = new WeightCalculator();
        cal.input();
        System.out.printf("Recommended Weight: %.2fkg",cal.recommendedWeight());
    }
    
}

class WeightCalculator{
    int age,height;
    Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        System.out.print("Enter Height: ");
        height = scanner.nextInt();
    }

    public double recommendedWeight(){
        return ((double)height - 100 + (double)age/10) * 0.9;
    }

}