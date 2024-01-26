package Lab3and4Extra;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
        this.radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        return super.toString() + "\nRadius: " + getRadius();
    }
}
