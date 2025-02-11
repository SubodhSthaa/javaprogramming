package BCAThirdSemester;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {

        int num1, num2, subtraction;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second number: ");
        num2 = sc.nextInt();

        subtraction = num1 - num2;

        System.out.println("The difference between the two numbers is: " + subtraction);

        sc.close();
    }
}
