//Write a program to create a class student with instance variables student name,id,grade. implement a default constructor and a parameterized constructor to take input of all three instance variables. Use constructor chaining to initialize the variables and print the value of variables

package BCAThirdSemester;

class student {
    String student_name;
    int id;
    char grade;

    // Default constructor
    public student() {
        System.out.println("Student Details:");
    }

    // Parameterized constructor
    public student(String student_name, int id, char grade) {
        this.student_name = student_name;
        this.id = id;
        this.grade = grade;
        System.out.println("Name: " + this.student_name);
        System.out.println("ID: " + this.id);
        System.out.println("Grade: " + this.grade);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        student std1 = new student();

        // Creating an object using the parameterized constructor
        student std2 = new student("Subodh", 40, 'A');
    }
}