 //2.Suppose there is a bank XYZ. Let us assume that initially, the bank has opened accounts of 10 customers. The first  customers are having savings account with initial deposit as given in the following table.
import java.util.*;

class Customer {
    private int id;
    private String name;
    private double balance;

    public Customer(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

public class q2{
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Ravi Sharma", 100));
        customers.add(new Customer(2, "Maya Kapoor", 500));
        customers.add(new Customer(3, "Varun Tagor", 50));
        customers.add(new Customer(4, "Touseef Khan", 400));
        customers.add(new Customer(5, "Sneha Patel", 250));
        customers.add(new Customer(6, "Amit Choudhary", 700));
        customers.add(new Customer(7, "Anjali Singh", 150));
        customers.add(new Customer(8, "Vikas Jain", 350));
        customers.add(new Customer(9, "Sanjay Gupta", 200));
        customers.add(new Customer(10, "Riya Singh", 300));

        System.out.println("Customer ID No.  Customer Names  Balance ($)");
        for (Customer customer : customers) {
            System.out.printf("%-16d%-16s%.2f\n", customer.getId(), customer.getName(), customer.getBalance());
        }

        Collections.sort(customers, Comparator.comparing(Customer::getId));

        System.out.println("\nSorted by Customer ID:");
        System.out.println("Customer ID No.  Customer Names  Balance ($)");
        for (Customer customer : customers) {
            System.out.printf("%-16d%-16s%.2f\n", customer.getId(), customer.getName(), customer.getBalance());
        }

        // Customer with ID no. 4 withdraws $100
        for (Customer customer : customers) {
            if (customer.getId() == 4) {
                customer.withdraw(100);
                break;
            }
        }

        System.out.println("\nAfter withdrawal by Customer with ID no. 4:");
        System.out.println("Customer ID No.  Customer Names  Balance ($)");
        for (Customer customer : customers) {
            System.out.printf("%-16d%-16s%.2f\n", customer.getId(), customer.getName(), customer.getBalance());
        }
    }
}
