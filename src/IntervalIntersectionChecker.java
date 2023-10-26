import java.util.Scanner;

public class IntervalIntersectionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double number = scanner.nextDouble();

        boolean isInIntersection = checkIntersection(number);

        if (isInIntersection) {
            System.out.println("The number is in the intersection of the intervals.");
        } else {
            System.out.println("The number is not in the intersection of the intervals.");
        }

        scanner.close();
    }

    public static boolean checkIntersection(double number) {
        boolean inA = ((number > -15 && number <= -10) || (number > -5 && number <= 10) || (number > 10 && number <= 10));
        boolean inB = number > -4;
        boolean inC = ((number >= -13 && number <= -8) || (number >= -3 && number <= -3));

        return inA && inB && inC;
    }
}
