package Lab1Extra;

public class MyPoint {
    private double x,y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public MyPoint(){
        x = 0.0;
        y = 0.0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint myPoint){
        double distance;
        distance = Math.sqrt(Math.pow(myPoint.x - this.x, 2) + Math.pow(myPoint.y - this.y, 2));
        return distance;
    }

    public double distance(double x, double y){
        double distance;
        distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return distance;
    }

    public static double distance(MyPoint point1, MyPoint point2){
        double distance;
        distance = Math.sqrt(Math.pow(point1.x - point2.x , 2) + Math.pow(point1.y - point2.y , 2));
        return distance;
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(0,0);
        MyPoint point2 = new MyPoint(10, 30.5);
        System.out.printf("Distance between point 1 and point 2: %.2f", point1.distance(point2));
    }
}
