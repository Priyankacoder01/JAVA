//1. Write a Java program to generate Fibonacci numbers from 1 to 100 using recursion method.
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series from 1 to 100 using Recursion:");
        for(int i = 1; i <= 100; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
        }
}
