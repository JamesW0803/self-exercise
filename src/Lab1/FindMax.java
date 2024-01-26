package Lab1;

public class FindMax {
    public static class Circle implements Comparable <Circle> {
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }
        @Override
        public int compareTo(Circle o) {
            return Double.compare(this.radius, o.radius);
        }
    }

    public static <E extends Comparable <E>> E max (E[] array){
        if (array == null || array.length == 0){
            return null;
        }

        E max = array[0];
        for (E element : array){
            if (element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3};
        Integer maxInteger = max(integers);
        System.out.println("Maximum integer: " + maxInteger);

        // List of strings
        String[] colors = {"red", "green", "blue"};
        String maxColor = max(colors);
        System.out.println("Maximum color: " + maxColor);

        // Array of circle objects
        Circle[] circles = {new Circle(3), new Circle(2.9), new Circle(5.9)};
        Circle maxCircle = max(circles);
        System.out.println("Circle with maximum radius: " + maxCircle.getRadius());
    }
}
