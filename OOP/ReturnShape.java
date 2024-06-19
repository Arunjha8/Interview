package OOP;

public class ReturnShape {
    public ReturnShape() {
    }

    public double area() {
        return 0;
    }

    public static ReturnShape getShape(int i) {
        if (i == 1) {
            return new ReturnRectangle(10, 10);
        }
        if (i == 2) {
            return new ReturnCircle(10);
        }
        return new ReturnShape();
    }
}
