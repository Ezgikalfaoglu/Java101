import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        n = input.nextInt();

        // Check if the number is less than 1
        if (n < 1) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Calculate the sum of proper divisors
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }

        // Check if the number is perfect
        if (total == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
    }
}