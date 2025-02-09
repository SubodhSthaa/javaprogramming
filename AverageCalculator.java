package BCAThirdSemester;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);

        double num, sum = 0;
        int count = 5, i;

        System.out.println("Enter 5 numbers:");
        for (i = 0; i < count; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            num = cc.nextDouble();
            sum += num;
        }

        double average = sum / count;
        System.out.println("The average is: " + average);

        cc.close();
    }
}