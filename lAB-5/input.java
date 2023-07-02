//Exp 2. Write a program in Java to take first name and last name from user and print both in one line    as last name followed by first name.
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String a=sc.next();
        System.out.println("Enter your last name:");
        String b=sc.next(); 
        System.out.println(b + " " + a);
    }

}