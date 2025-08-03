package BCAThirdSemester;

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public static void compare(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea()) {
            System.out.println("First rectangle is larger.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("Second rectangle is larger.");
        } else {
            System.out.println("Both rectangles are equal.");
        }
    }
}

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(15, 15);
        Rectangle.compare(r1, r2);
    }
}