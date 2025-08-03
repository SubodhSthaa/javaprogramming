package BCAThirdSemester;

class Student {
    String name;

    Student() {
        this.name = "Unknown";
    }

    Student(String name) {
        this.name = name;
    }
}

public class studentconstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Subodh");
        System.out.println("Student 1: " + s1.name);
        System.out.println("Student 2: " + s2.name);
    }
}