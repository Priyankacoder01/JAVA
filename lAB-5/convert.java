// Write a program to convert a binary numbers to decimal number and vice-versa.
import java.util.Scanner;

public class convert{
    
    public static int binaryToDecimal(int binary){
        int decimal = 0;
        int bin = binary;
        int i=0;
        while(bin>0){ 
            int rem = bin % 10;
            bin = bin/10;
            decimal = decimal + rem * (int)Math.pow(2,i++);
        }
        return decimal;
    }

    public static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
          int remainder = decimal % 2;
          binary = remainder + binary;
          decimal = decimal / 2;
        }
        return binary;
      }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert binary to decimal : ");
        System.out.println("Enter 2 to convert decimal to binary : ");
        int choice = sc.nextInt();
        switch(choice){
        case 1:
        System.out.println("Enter binary number: ");
        int binary = sc.nextInt();
        System.out.println("Decimal equivalent: " + binaryToDecimal(binary));
        break;
        case 2:
        System.out.println("Enter decimal number: ");
        int decimal = sc.nextInt();
        System.out.println("Binary equivalent: " + decimalToBinary(decimal));
        break;
        default:
        System.out.println("Invalid input");
        }
}

}