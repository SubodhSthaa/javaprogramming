package BCAThirdSemester;

class work {
    int a;
    double b;

    // Constructor with one integer parameter
    work(int a) {

        this.a = a;
    }

    // Constructor with one double parameter
    work(double b) {

        this.b = b;
    }

    void show() {
        if (a != 0) {
            System.out.println("Integer: " + a);
        } else {
            System.out.println("Double: " + b);
        }
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        work obj1 = new work(5);
        work obj2 = new work(5.5);
        obj1.show();
        obj2.show();
    }
}