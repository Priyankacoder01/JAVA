//3.Write a program to calculate area according to user input, whether it is circle, square or triangle (Menu Driven). [Hints: Use switch case]
import java.util.Scanner;

public class area
{
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println(" calculated area of circle,square,rectangle :");
        System.out.print("Enter : \n  c for  Area of circle \n  s for Area of square  \n  r for  area of rectangle\n Enter your choice :");
        char choice = in.next().charAt(0);
        
        switch(choice) {
            case 'c':
            case 'C':
                System.out.print("Enter radius of circle: ");
                double r = in.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;
                
            case 's':
                System.out.print("Enter side of square: ");
                double side = in.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;
                
            case 'r':
                System.out.print("Enter length of rectangle: ");
                double l = in.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double b = in.nextDouble();
                double ra = l * b;
                System.out.println("Area of rectangle = " + ra);
                break;
                
            default:
                System.out.println("Wrong choice!");
        }
    }
}