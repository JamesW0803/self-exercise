package Lab3and4Extra;

public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject geometricObject = new GeometricObject();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(9, "black", false);
        Rectangle rectangle = new Rectangle();

        System.out.println(geometricObject.toString());
        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
        System.out.println(rectangle.toString());
    }
}
