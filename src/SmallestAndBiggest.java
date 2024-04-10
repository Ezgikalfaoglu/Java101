import java.util.Scanner;

public class SmallestAndBiggest{
    public static void main(String[] args) {
        int total;
        int max=0;
        int min=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter: ");
        total = scanner.nextInt();

        for (int i = 1; i <=total; i++) {
            System.out.println(i + ". you entered the number: ");
            int number = scanner.nextInt();
            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }
        } System.out.println("Biggest number is: " + max);
        System.out.println("Smallest number is " + min);

    }
}