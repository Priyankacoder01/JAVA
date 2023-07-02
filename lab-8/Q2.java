

class Shape {
    protected double area;
    void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void calculateArea() {
        area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calculateArea() {
        area = length * breadth;
    }
}

public class Q2{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.showArea();
        
        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        rectangle.showArea();
    }
}

