package BCAThirdSemester;

import java.util.Scanner;

class Operations {
    void sum(double a, double b) {
        double sum = a + b;
        System.out.println("Sum: " + sum);
    }

    void sub(double a, double b) {
        double sub = a - b;
        System.out.println("Subtraction: " + sub);
    }

    void div(double a, double b) {
        if (b != 0) {
            double div = a / b;
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    void mul(double a, double b) {
        double mul = a * b;
        System.out.println("Multiplication: " + mul);
    }
}

public class Demo {
    public static void main(String[] args) {
        double a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = sc.nextDouble();

        System.out.println("Enter the second number: ");
        b = sc.nextDouble();

        Operations op = new Operations();

        op.sum(a, b);
        op.sub(a, b);
        op.div(a, b);
        op.mul(a, b);

        sc.close();
    }
}