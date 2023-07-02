//1.In a KIIT University, the health check-up of students of a particular class was conducted. The following table was prepared showing the records of a group of 10 students.
import java.util.Scanner;

public class Studenthc{
    public static void main(String[] args) {
        // Define the 2D array of student data
        String[][] data = {
            {"Student 1", "", ""},
            {"Student 2", "", ""},
            {"Student 3", "", ""},
            {"Student 4", "", ""},
            {"Student 5", "", ""},
            {"Student 6", "", ""},
            {"Student 7", "", ""},
            {"Student 8", "", ""},
            {"Student 9", "", ""},
            {"Student 10", "", ""}
        };

        // Read the weight and height data for each student from the user
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter weight and height for " + data[i][0] + ":");
            data[i][1] = sc.nextLine();
            data[i][2] = sc.nextLine();
        }

        // Determine the student with the highest and lowest value of height
        int maxHeightIndex = 0, minHeightIndex = 0;
        double maxHeight = Double.parseDouble(data[0][2]), minHeight = Double.parseDouble(data[0][2]);
        for (int i = 1; i < data.length; i++) {
            double height = Double.parseDouble(data[i][2]);
            if (height > maxHeight) {
                maxHeight = height;
                maxHeightIndex = i;
            } else if (height < minHeight) {
                minHeight = height;
                minHeightIndex = i;
            }
        }
        System.out.println("Student with the highest height: " + data[maxHeightIndex][0]);
        System.out.println("Student with the lowest height: " + data[minHeightIndex][0]);

        // Determine the student with the highest and lowest value of weight
        int maxWeightIndex = 0, minWeightIndex = 0;
        double maxWeight = Double.parseDouble(data[0][1]), minWeight = Double.parseDouble(data[0][1]);
        for (int i = 1; i < data.length; i++) {
            double weight = Double.parseDouble(data[i][1]);
            if (weight > maxWeight) {
                maxWeight = weight;
                maxWeightIndex = i;
            } else if (weight < minWeight) {
                minWeight = weight;
                minWeightIndex = i;
            }
        }
        System.out.println("Student with the highest weight: " + data[maxWeightIndex][0]);
        System.out.println("Student with the lowest weight: " + data[minWeightIndex][0]);
   }
}
