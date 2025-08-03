package BCAThirdSemester;

        class First {
            int num1, num2, num3;

            First(int num1, int num2) {
                this(num1,num2,0);
            }

            First(int num1, int num2, int num3) {
                this.num1 = num1;
                this.num2 = num2;
                this.num3 = num3;
            }
            void sum() {
                int sum = num1 + num2 + num3;
                System.out.println("Sum is: " + sum);
            }
        }

        public class sumthroughconstructor {
            public static void main(String[] args) {
                First sm = new First(20,40,60);
                sm.sum();
            }
        }