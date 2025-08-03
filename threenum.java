//Write a program to read three numbers x,y,z and calculate R=Z/X-Y
package BCAThirdSemester;
import java.util.Scanner;

public class threenum {
    public static void main(String[] args) {
        double x, y, z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = sc.nextDouble();
        System.out.println("Enter the value of y");
        y = sc.nextDouble();
        System.out.println("Enter the value of z");
        z = sc.nextDouble();

        if(x==0||y==0) {
            System.out.println("Division by zero is not possible");
            System.exit(0);
        }else{
            double R = z /x-y;
            System.out.println("Result: " + R);
        }
        sc.close();
    }
}