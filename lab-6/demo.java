//4.Write a class file – box with three data members (length, width, height) and a method volume() . Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.
import java.util.Scanner;

class demo {
    public void volume(int length,int breadth,int height){
        int vol=length*breadth*height;
        System.out.println("Volume of Box is: "+vol);
    }
}

public class WTlab6q3 {
    public static void main (String[] args){
        int a,b,c;
        Scanner lbh = new Scanner (System.in);
        System.out.println("Enter the length breadth and height of the box: ");
        a = lbh.nextInt();
        b = lbh.nextInt();
        c = lbh.nextInt();
        Box myBox = new Box();
        myBox.volume(a,b,c);;
}
}