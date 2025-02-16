import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter student grades (-1 to stop):");
        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) break;  // Stop when user enters -1
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            int highest = grades.get(0);
            int lowest = grades.get(0);
            int sum = 0;

            for (int grade : grades) {
                sum += grade;
                if (grade > highest) highest = grade;
                if (grade < lowest) lowest = grade;
            }

            double average = (double) sum / grades.size();
            System.out.println("Total students: " + grades.size());
            System.out.println("Average Grade: " + average);
            System.out.println("Highest Grade: " + highest);
            System.out.println("Lowest Grade: " + lowest);
        }

        scanner.close();
    }
}
