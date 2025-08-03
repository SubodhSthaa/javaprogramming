package BCAThirdSemester;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int j = 0; j < 5; j++) {
            System.out.println("Enter details for student " + (j + 1) + ":");
            System.out.print("Roll Number of Student: ");
            int rollNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("The Name of Student: ");
            String name = sc.nextLine();
            System.out.print("Address of Student: ");
            String address = sc.nextLine();

            int totalmarks = 0;
            System.out.println("Enter marks for 5 subjects: ");
            for (int i = 0; i < 5; i++) {
                totalmarks += sc.nextInt();
            }
            double percentage = totalmarks / 5.0;
            String division;
            if (percentage >= 80) {
                division = "Distinction";
            } else if (percentage >= 60) {
                division = "First Division";
            } else if (percentage >= 50) {
                division = "Second Division";
            } else {
                division = "Fail";
            }

            System.out.println("\nResult for student " + (j + 1) + ":");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Address: " + address);
            System.out.println("Total Marks: " + totalmarks);
            System.out.println("Percentage: " + percentage);
            System.out.println("Division: " + division);

        }
    }
}