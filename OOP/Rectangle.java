package OOP;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        System.out.println("This is default constructor Rectangle");
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
