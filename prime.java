package BCAThirdSemester;
import java.util.Scanner;

public class prime {
    static boolean PrimeCheck(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println("The number is neither prime nor composite");
        } else if (PrimeCheck(num)) {
            System.out.println("The Number is prime");
        } else {
            System.out.println("The number is composite");
        }
    }
}