abstract class student {
    int rollno;
    int regno;
    public abstract void course();
}
class Kiitian extends student{
    @Override
    public void course(){
        System.out.println("I am enrolled in computer science course.");
    }

}
public class Q1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.rollno = 123;
        k.regno = 456;
        k.course();
   }
}