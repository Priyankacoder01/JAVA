//2. Accept 10 numbers from command line and check how many of them are even and how many odd.
import java.util.Scanner;
public class even{
    public static void main(String[] args) 
    {
        int x[]=new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter the number:");
            x[i]=s.nextInt();
        }
        for(int i=0;i<10;i++){
            if(x[i]%2==0){
                System.out.println("is even");
            }
            else{
                System.out.println("is odd");
            }
        }

   }
}