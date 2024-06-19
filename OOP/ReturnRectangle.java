package OOP;

public class ReturnRectangle extends ReturnShape {
    private double length;
    private double width;

    public ReturnRectangle() {
    }

    public ReturnRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}
