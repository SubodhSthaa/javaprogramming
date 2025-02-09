package BCAThirdSemester;

import java.util.Scanner;

public class addition {
    public static void main(String[] args){

        int num1,num2,sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.println("Enter the Second number: ");
        num2 = sc.nextInt();

        sum=num1+num2;

        System.out.println("The sum of the two numbers is: "+sum);

        sc.close();
    }
}