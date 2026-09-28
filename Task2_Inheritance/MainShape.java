import java.util.Scanner;
import java.util.ArrayList;

public class MainShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Shape Menu ===");
            System.out.println("1. Add Square");
            System.out.println("2. Add Circle");
            System.out.println("3. Add Cylinder");
            System.out.println("4. Print All Shapes Info");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            
            if (!scanner.hasNextInt()) break;
            int option = scanner.nextInt();

            if (option == 0) break;

            switch (option) {
                case 1:
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    System.out.print("Enter color: ");
                    String sqColor = scanner.next();
                    shapes.add(new Square(side, sqColor));
                    System.out.println("Square added.");
                    break;
                case 2:
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    System.out.print("Enter color: ");
                    String cColor = scanner.next();
                    shapes.add(new Circle(radius, cColor));
                    System.out.println("Circle added.");
                    break;
                case 3:
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    System.out.print("Enter radius: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter color: ");
                    String cylColor = scanner.next();
                    shapes.add(new Cylinder(height, cylRadius, cylColor));
                    System.out.println("Cylinder added.");
                    break;
                case 4:
                    System.out.println("\n--- Shapes Info ---");
                    for (Shape s : shapes) {
                        s.printInfo();
                    }
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}
