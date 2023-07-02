//4.Write a program to use a class Account with the following specifications: 
// Class name — Account
// Data members — int acno, float balance
// Member Methods:
// 1.Account (int a, int b) — to initialize acno = a, balance = b
// 2.void withdraw(int w) — to maintain the balance with withdrawal (balance - w)
// 3.void deposit(int d) — to maintain the balance with the deposit (balance + d)
// Use another class Calculate which inherits from class Account with the following specifications:
// Data members — int r,t ; float si,amt;

class Account{
    int acno;
    float balance;

    public Account(int a, float b){
        acno = a;
        balance = b;
    }

    public void withdraw(float w){
        balance -= w;
    }

    public void deposit(float d){
        balance += d;
    }
}
class Calculate extends Account{
    int r,t;
    float si, amt;

    public Calculate(int a, float b){
        super(a,b);
        r = 0;
        t =0 ;
        amt = 0;
    }


    public void accept(int x , int y){
        r = x;
        t  = y;
    }
    public void compute(){
        si = (balance * r * t)/100;
        amt = balance + si;
    }
    public void display(){
        System.out.println("Account Number : " + acno);
        System.out.println("Balance : " + balance);
        System.out.println("Interest : " + si);
        System.out.println("Amount : " + amt);
    }
}

public class Account1 {
    public static void main(String[] args){
        Calculate c = new Calculate(123, 100000);
        c.accept(5,2);
        c.compute();
        c.display();
        c.withdraw(10000);
        c.compute();
        c.display();
        c.deposit(5000);
        c.compute();
        c.display();
  }
}

