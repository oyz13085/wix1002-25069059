package Lab

public class Q1{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setSide(4,5);
        rectangle.calculate();
        rectangle.display();

        Square square = new Square();
        square.setSide(5);
        square.calculate();
        square.display();

        Circle circle = new Circle();
        circle.setDiameter(1);
        circle.calculate();
        circle.display();

    }
    
}

class Shape{
    protected String name;
    protected double perimeter, area;

    public double getPerimeter(){
        return perimeter;
    }

    public void setPerimeter(double a){
        perimeter = a;
    }

    public double getArea(){
        return area;
    }

    public void setArea(double a){
        area = a;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.printf("Perimeter: %.2f\n",getPerimeter());
        System.out.printf("Area: %.2f\n",getArea());
    }

}

class Rectangle extends Shape{
    protected int sideLength1,sideLength2;
    
    public Rectangle(){
        super.name = "Rectangle";
    }

    public void setSide(int a,int b){
        sideLength1 = a;
        sideLength2 = b;
    }

    public void calculate(){
        super.setPerimeter(2 * sideLength1 + 2 * sideLength2);
        super.setArea(sideLength1 * sideLength2);
    }
}

class Square extends Shape{
    protected int sideLength;
    public Square(){
        super.name = "Square";
    }

    public void setSide(int a){
        sideLength = a;
    }

    public void calculate(){
        super.setPerimeter(4 * sideLength);
        super.setArea(sideLength * sideLength);
    }
}

class Circle extends Shape{
    protected int diameter;
    final double pi = 3.142;
    public Circle(){
        super.name = "Circle";
    }

    public void setDiameter(int a){
        diameter = a;
    }

    public void calculate(){
        super.setPerimeter(2 * pi * (double)diameter/2);
        super.setArea(pi * Math.pow((double)diameter/2,2));
    }

}