package BCAThirdSemester;

import java.util.Scanner;

class Operations {
    void sum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    void sub(int a, int b) {
        int sub = a - b;
        System.out.println("Subtraction: " + sub);
    }

    void div(int a, int b) {
        if (b != 0) {
            int div = a / b;
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }

    void mul(int a, int b) {
        int mul = a * b;
        System.out.println("Multiplication: " + mul);
    }
}

public class Demo {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        a = sc.nextInt();

        System.out.println("Enter the second number: ");
        b = sc.nextInt();

        Operations op = new Operations();

        op.sum(a, b);
        op.sub(a, b);
        op.div(a, b);
        op.mul(a, b);

        sc.close();
    }
}