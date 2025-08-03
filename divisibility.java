package BCAThirdSemester;
import java.util.Scanner;

public class divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 7 == 0 ) {
            System.out.println("The Number is Divisible by 3 and 7");
        } else {
            System.out.println("The Number is not Divisible by 3 and 7");
        }
    }
}