package BCAThirdSemester;
abstract class shape{
    public abstract void rectangleArea(float length, float breadth);
    public abstract void squareArea(float side);
    public abstract void circleArea(float radius);
}
public class area {
    public static void main(String[] args) {
        shape sph = new shape() {
            @Override
            public void rectangleArea(float length, float breadth) {
                System.out.println("Area of rectangle: " + (length * breadth));
            }
            @Override
            public void squareArea(float side) {
                System.out.println("Area of square: " + (side * side));
            }
            @Override
            public void circleArea(float radius) {
                System.out.println("Area of circle: " + (3.14 * radius * radius));
            }
        };
        sph.rectangleArea(533, 120);
        sph.squareArea(32);
        sph.circleArea(55);
    }
}
