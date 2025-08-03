package BCAThirdSemester;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("Choose operation: \n1. Add \n2. Subtract \n3. Multiply \n4. Divide");
            int calculator = sc.nextInt();
            System.out.println("Enter two numbers: ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            switch (calculator) {
                case 1 -> System.out.println("The Sum is: " + (a + b));
                case 2 -> System.out.println("The Difference is: " + (a - b));
                case 3 -> System.out.println("The Product is: " + (a * b));
                case 4 -> System.out.println("The Quotient is: " + (b != 0 ? a / b : "Cannot divide by zero"));
                default -> System.out.println("Invalid choice. Choose again.");
            }
            System.out.println("Continue? \ny for Yes. \n n for No.");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

}
