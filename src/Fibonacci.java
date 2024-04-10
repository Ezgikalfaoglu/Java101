import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci series elements: ");
        int n = inp.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(n+" element fibonacci number sequence: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}