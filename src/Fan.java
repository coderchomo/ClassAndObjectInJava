public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = true;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return this.speed + this.color + this.radius + "Fan is On";
        } else {
            return this.color + this.radius + "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2=new Fan();
        fan2.setSpeed(MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
