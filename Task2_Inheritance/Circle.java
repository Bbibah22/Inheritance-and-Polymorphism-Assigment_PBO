public class Circle extends Shape {
    protected double radius;
    public static final double PI = Math.PI;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle colored " + color + ", area = " + area());
    }
}
