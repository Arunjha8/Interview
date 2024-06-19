package OOP;

public class ReturnCircle extends ReturnShape {
    private double radius;

    public ReturnCircle() {
    }

    public ReturnCircle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}
