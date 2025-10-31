import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;


public class Main {
    static void Q1(){
        System.out.print("Enter two integer number: ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operand: ");
        char Op = input.next().charAt(0);
        int ans = 0;
        switch(Op){
            case '+': ans = num1 + num2; break;
            case '-': ans = num1 - num2; break;
            case '*': ans = num1 * num2; break;
            case '/': ans = num1 / num2; break;
            case '%': ans = num1 % num2; break;
        }
        System.out.println(num1 + " " + Op + " " + num2 + " = " + ans);
    }

    static void Q2(){
        HashMap<Integer,String> integer = new HashMap<>();
        integer.put(0,"zero");
        integer.put(1,"one");
        integer.put(2,"two");
        integer.put(3,"three");
        integer.put(4,"four");
        integer.put(5,"five");
        Random random = new Random();
        int randomNum = random.nextInt(6);
        String word = integer.get(randomNum);
        System.out.println(randomNum + " is " + word +".");
    }

    static void Q3(){
        System.out.print("Sales Volume: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();
        double commission = 0;
        if(sales <= 100){
            commission = sales * 5.00 / 100;
        }else if(sales <= 500){
            commission = sales * 7.5 / 100;
        }else if(sales <= 1000){
            commission = sales * 10.00 / 100;
        }else{
            commission = sales * 12.5 / 100;
        }
        System.out.printf("Commission: %.2f",commission);
    }

    static void Q4(){
        int p1 = 0;
        int p2 = 0;
        Random random = new Random();
        System.out.print("Player 1: ");
        for(int i = 0; i < 2; i++){
            int diceValue = random.nextInt(6) + 1;
            System.out.print(diceValue + " ");
            p1+=diceValue;
        }
        System.out.print("\nPlayer 2: ");
        for(int i = 0; i < 2; i++){
            int diceValue = random.nextInt(6) + 1;
            System.out.print(diceValue + " ");
            p2+=diceValue;
        }
        if(p1 > p2){
            System.out.println("\nPlayer 1 wins!");
        }else if(p2 > p1){
            System.out.println("\nPlayer 2 wins!");
        }else{
            System.out.println("\nDraw!");
        }
    }

    static void Q5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f (in order): ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int check = (a*d)-(b*c);
        if(check == 0){
            System.out.println("The equation has no solution");
        }else{
            int x = ((e*d)-(b*f))/(check);
            int y = ((a*f)-(e*c))/(check);
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }

    static void Q6(){
        Scanner input = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = input.nextDouble();
        System.out.print("x-coordinate = ");
        double x = input.nextDouble();
        System.out.print("y-coordinate = ");
        double y = input.nextDouble();
        double length = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if(radius >= length){
            System.out.println("The point is inside the circle");
        }else{
            System.out.println("The point is outside the circle");
        }
    }



    public static void main(String[] args) {
        Q6();
    }
}