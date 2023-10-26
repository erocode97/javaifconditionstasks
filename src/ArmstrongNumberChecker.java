import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int originalNumber = number;
            int sum = 0;

            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, 3);
                number /= 10;
            }

            if (originalNumber == sum) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        } else {
            System.out.println("Please enter a valid three-digit number.");
        }

        scanner.close();
    }
}