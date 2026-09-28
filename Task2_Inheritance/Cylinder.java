public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double volume() {
        return area() * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Cylinder colored " + color + ", volume = " + volume());
    }
}
