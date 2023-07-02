class Course {
    protected int credit;
    protected String medium;
    protected int numStudents;

    public Course(int credit, String medium) {
        this.credit = credit;
        this.medium = medium;
        this.numStudents = 0;
    }

    public void display() {
        if (numStudents >= 2) {
            System.out.println("Course is floated.");
        } else {
            System.out.println("Course is not floated.");
        }
    }

    public void number(int numStudents) {
        this.numStudents = numStudents;
    }
}

class CourseA extends Course {
    public CourseA(int credit, String medium) {
        super(credit, medium);
    }

    public void display() {
        System.out.println("Course A details:");
        System.out.println("Credit: " + credit);
        System.out.println("Medium: " + medium);
        System.out.println("Number of students: " + numStudents);
        super.display();
    }
}

class CourseB extends Course {
    public CourseB(int credit, String medium) {
        super(credit, medium);
    }

    public void display() {
        System.out.println("Course B details:");
        System.out.println("Credit: " + credit);
        System.out.println("Medium: " + medium);
        System.out.println("Number of students: " + numStudents);
        super.display();
    }
}

public class q3 {
    public static void main(String[] args) {
        CourseA a = new CourseA(3, "English");
        CourseB b = new CourseB(2, "Hindi");

        a.number(2);
        b.number(1);

        a.display();
        b.display();
   }
}
