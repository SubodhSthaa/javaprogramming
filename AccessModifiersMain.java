package BCAThirdSemester;

        class AccessModifiers {
            public int publicVar = 1;
            private int privateVar = 2;
            protected int protectedVar = 3;

            public void display() {
                System.out.println("Public: " + publicVar);
                System.out.println("Private: " + privateVar);
                System.out.println("Protected: " + protectedVar);
            }
        }

        public class AccessModifiersMain {
            public static void main(String[] args) {
                byte myByte = 100;
                System.out.println("Byte value: " + myByte);

                AccessModifiers obj = new AccessModifiers();
                obj.display();
                System.out.println("Accessing public: " + obj.publicVar);
                // obj.privateVar; // Error: privateVar has private access
                System.out.println("Accessing protected: " + obj.protectedVar);
            }
        }