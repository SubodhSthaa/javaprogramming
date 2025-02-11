package BCAThirdSemester;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
    int num1,num2,division;

    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the first number: \n");
            num1=sc.nextInt();
    System.out.println("Enter the second number: \n");
    num2=sc.nextInt();

    division=num1/num2;

    System.out.println("the division of two numbers is: " +division);

    sc.close();
}
}
