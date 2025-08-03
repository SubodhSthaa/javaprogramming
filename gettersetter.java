package BCAThirdSemester;

class MathOperations {
    private int a, b;

    void set(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int subtract() {
        return a - b;
    }
}

public class gettersetter {
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        mo.set(10, 5);
        System.out.println("Sum: " + mo.add());
        System.out.println("Difference: " + mo.subtract());
    }
}