package Lab1Extra;

public class Circle2D {
    double x,y;
    double radius;

    public Circle2D(){
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    public Circle2D(double x, double y , double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y){
        double squaredDistance = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        return squaredDistance <= Math.pow(radius, 2);
    }

    public boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return distance + circle.getRadius() <= this.radius;
    }

    public boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
        return distance < this.radius + circle.getRadius();
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        System.out.println("Contains point (3,3): " + c1.contains(3, 3));
        System.out.println("Contains circle (4,5,10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Overlaps circle (3,5,2.3): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}
