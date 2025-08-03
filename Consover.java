package BCAThirdSemester;

class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Consover {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob", 25);
    }
}