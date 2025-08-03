package BCAThirdSemester;

class A extends B{
    void show(){
        int value=100;
        System.out.println("This is a method of class A");
    }
}

class B{
    void read(){
        System.out.println("This is a method of class B");
    }
}
public class inheritance extends A{

    public static void main(String[] args) {
        inheritance obj = new inheritance();
        obj.show();
        System.out.println("Data="+obj);

        obj.read();

    }
}
