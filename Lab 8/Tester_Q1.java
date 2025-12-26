//Question 1
public class Tester {
    public static void main(String[] args){
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4,50);

    }
    
}

class Number{
    int noOfNumbers, upperBound;
    int[] numbers;

    public Number(){
        this(10,100);
        
    }

    public Number(int noOfNumbers){
        this(noOfNumbers,100);
        this.noOfNumbers = noOfNumbers;
        this.upperBound = 100;

    }

    public Number(int noOfNumbers, int upperBound){
        this.noOfNumbers = noOfNumbers;
        this.upperBound = upperBound;
        generate();
        display();

    }
    
    public void generate(){
        this.numbers = new int[noOfNumbers];

        for(int i=0;i<noOfNumbers;i++){
            numbers[i] = (int)(Math.random() * (upperBound+1));
        }

    }

    public void displayNumbers(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public void display(){
        System.out.print("The numbers generated: ");
        int even=0,prime=0,max=0,min=999,total=0,square=0;

        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
            if(numbers[i]%2==0){
                even++;
            }
            if(checkPrime(numbers[i])){
                prime++;
            }
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
            if(checkSquareNumber(numbers[i])){
                square++;
            }
            total+=numbers[i];
        }

        //Print out even numbers
        System.out.print("\nEven Numbers: ");
        evenNumbers(even);
        //Print our prime numbers
        System.out.print("\nPrime Numbers: ");
        primeNumbers(prime);
        //Print out maximum
        System.out.print("\nMaximum Number: ");
        System.out.print(max);
        //Print out minimum
        System.out.print("\nMinimum Number: ");
        System.out.print(min);
        //Print out average
        System.out.print("\nAverage: ");
        System.out.printf("%.2f",(double)total/numbers.length);
        //Print out square numbers
        System.out.print("\nSquare Numbers: ");
        squareNumbers(square);
        System.out.println("\n ");

    }

    public void evenNumbers(int even){
        int[] evenNumbers = new int[even];
        int index = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                evenNumbers[index] = numbers[i];
                index++;
            }
        }
        displayNumbers(evenNumbers);
    }

    public boolean checkPrime(int a){
        return a==2||a==3||a==5||a==7||(a%2!=0 && a%3!=0 && a%5!=0 && a%7!=0 && a!=1);
    }

    public void primeNumbers(int prime){
        int[] primeNumbers = new int[prime];
        int index = 0;
        for(int i=0;i<numbers.length;i++){
            if(checkPrime(numbers[i])){
                primeNumbers[index] = numbers[i];
                index++;
            }
        }
        displayNumbers(primeNumbers);

    }

    public boolean checkSquareNumber(int a){
        return Math.pow(Math.ceil(Math.sqrt(a)),2) == a; 
    }

    public void squareNumbers(int square){
        int[] squareNumbers = new int[square];
        int index = 0;
        for(int i=0;i<numbers.length;i++){
            if(checkSquareNumber(numbers[i])){
                squareNumbers[index] = numbers[i];
                index++;
            }
        }
        displayNumbers(squareNumbers);
    }
}
