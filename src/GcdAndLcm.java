import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        int num1, num2, gcd, lcm;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        // Swap numbers if num1 is smaller than num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Calculate GCD using Euclidean algorithm
        gcd = 1;
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        // Calculate LCM
        lcm = num1 * num2 / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}