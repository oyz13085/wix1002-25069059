import java.util.Arrays;
public class Lab_6_Question_1 {
    public static void main(String[] args) {
        /* 
        numberGenerator();
        System.out.println(Arrays.toString(randomNumbers));
        numberGenerator();
        System.out.println(Arrays.toString(randomNumbers));
        */
       System.out.println(genTwice());
    }

    //method 1
    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }

    //method 2
    public static boolean isSquareNumber(int a){
        return Math.pow(Math.sqrt(a),2) == a;
    }

    //method 3
    public static int combination(int n, int r){
        return factorial(n)/(factorial(r) * factorial(n-r));
    }

    //for combination method
    public static int factorial(int a){
        if(a==1 || a==0){
            return 1;
        }else{
            return a * factorial(a-1);
        }
    }

    //method 4
    public static boolean isPentagonal(int a){
        int n=1;
        while(n<=a){
            if(a == n * (3 * n-1)/2){
                return true;
            }
            n++;
        }
        return false;
    }

    //method 5
    public static void counter(String line){
        int digit = 0, letter = 0;
        char[] characters = line.toCharArray();
        for(char character:characters){
            if(Character.isDigit(character)){
                digit++;
            }else{
                letter++;
            }
        }
        System.out.println("Number of letter: " + letter);
        System.out.println("Number of digit: " + digit);

    }

    //method 6
    static int[] randomNumbers = new int[10]; //this is a class (Lab_6_Question_1) variable
    public static void numberGenerator(){
        for(int i=0;i<10;i++){
            randomNumbers[i] = (int)(Math.random() * 101);
        }
    }

    //method 7
    public static void circleCal(int radius){
        final double pi = 3.14;
        System.out.printf("Area: %.2f\n",pi*radius*radius);
        System.out.printf("Circumference: %.2f",2*pi*radius);
    }

    //method 8
    public static int genTwice(){
        int[] appear = new int[10];
        for(int i=0;i<10;i++){
            appear[i] = (int)(Math.random() * 11);
        }
        System.out.println(Arrays.toString(appear));
        for(int i=0;i<9;i++){
            for(int j=i+1;j<10;j++){
                if(appear[i] == appear[j]){
                    return appear[i];
                }
            }
        }
        return (int)(Math.random() * 11);
    }

}