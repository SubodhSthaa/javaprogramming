package BCAThirdSemester;
import java.util.Scanner;

        class MyCode {
            private Scanner sc = new Scanner(System.in);

            public int takeInt(String prompt) {
                System.out.print(prompt);
                return sc.nextInt();
            }

            public double takeDouble(String prompt) {
                System.out.print(prompt);
                return sc.nextDouble();
            }

            public String take(String prompt) {
                System.out.print(prompt);
                sc.nextLine(); // Consume newline
                return sc.nextLine();
            }
        }

        public class RollNameDemo {
            private int roll;
            private int age;
            private String name;

            public void takeInputs() {
                MyCode myCode = new MyCode();
                roll = myCode.takeInt("Enter Roll: ");
                age = myCode.takeInt("Enter Age: ");
                name = myCode.take("Enter Name: ");
            }

            public void display() {
                System.out.println("Roll: " + roll);
                System.out.println("Age: " + age);
                System.out.println("Name: " + name);
            }

            public static void main(String[] args) {
                RollNameDemo demo = new RollNameDemo();
                demo.takeInputs();
                demo.display();
            }
        }