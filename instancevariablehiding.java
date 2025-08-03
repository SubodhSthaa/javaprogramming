package BCAThirdSemester;

class Parent {
    Parent()
    {
        System.out.println("P.Constructor");
    }
    int num = 10;
}

class Child extends Parent {
    int num = 20;

    Child()
    {
        super();
        System.out.println("C.Constructor");

    }

    void show() {
        System.out.println("Child num: " + num + " \nParent num: " + super.num);
    }
}

public class instancevariablehiding {
    public static void main(String[] args) {
        Child cd = new Child();
        cd.show();
    }
}