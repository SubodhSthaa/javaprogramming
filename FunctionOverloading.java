package BCAThirdSemester;
    
    class Homework {
        public Homework() {
        }

        void show(int a) {

            System.out.println("Integer: " + a);
        }
        void show(double a) {

            System.out.println("Double: " + a);
        }
        void show(char a) {

            System.out.println("Character: " + a);
        }
        void show(String a) {

            System.out.println("String: " + a);
        }
    }
    
    public class FunctionOverloading {
        public static void main(String[] args) {
            Homework obj = new Homework();
            obj.show(5);
            obj.show(5.5);
            obj.show('A');
            obj.show("Hello");
        }
    }