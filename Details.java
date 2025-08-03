package BCAThirdSemester;

import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        String name, address;
        int age;

        Scanner det = new Scanner(System.in);
        Scanner det2 = new Scanner(System.in);

        System.out.print("Enter your name: \n");
        System.out.print("Enter your address: \n");
        System.out.print("Enter your age: \n");

        name = det.nextLine();
        address = det.nextLine();
        age = det2.nextInt();

        System.out.print("Student Details: \n");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);

        det.close();
        det2.close();
    }
}

