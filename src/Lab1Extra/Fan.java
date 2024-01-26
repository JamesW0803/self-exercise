package Lab1Extra;

public class Fan {
    public int SLOW = 1;
    public int MEDIUM = 2;
    public int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";

    public Fan(){}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Description of the Fan: ");
        if (on){
            sb.append("\nFan speed: ").append(this.speed);
        }else{
            sb.append("\nFan is off");
        }
        sb.append("\nFan color: ").append(this.color).append("\nFan radius: ").append(this.radius);
        return sb.toString();
    }
}
