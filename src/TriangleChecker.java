import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        boolean isTriangle = checkTriangle(side1, side2, side3);

        if (isTriangle) {
            System.out.println("A triangle with these side lengths can exist.");
        } else {
            System.out.println("No triangle with these side lengths can exist.");
        }

        scanner.close();
    }

    public static boolean checkTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
