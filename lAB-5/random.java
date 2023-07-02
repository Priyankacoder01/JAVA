//Exp 4.- Write a program to generate a of random numbers between 1 and 6.
import java.util.Random;
 
public class random {
 
    public static void main(String[] args) {
 
        System.out.println("============================");
        System.out.println("Generating 6 random integer in range of 1 to 6 using Random");
        System.out.println("============================");
        Random randomGenerator=new Random();
        for (int i = 0; i < 6; i++) {
            System.out.println(randomGenerator.nextInt(6) + 1);
        }
    }
}