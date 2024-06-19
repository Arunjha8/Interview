package OOP;

public class Circle extends Shape {
    private double radius;
    public final double PI = 3.14;

    public Circle() {
        System.out.println("This is defult constructor Circle");
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}
