import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lengths of the three sides:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();
        classifyTriangle(side1, side2, side3);
        scanner.close();
    }
    public static void classifyTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid input: Sides must be greater than zero.");
            return;
        }
        
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Not a Triangle: The sum of any two sides must be greater than the third side.");
            return;
        }
        if (a == b && b == c) {
            System.out.println("The triangle is an Equilateral Triangle.");
        } else if (a == b || b == c || a == c) {
            System.out.println("The triangle is an Isosceles Triangle.");
        } else {
            System.out.println("The triangle is a Scalene Triangle.");
        }
    }
}
