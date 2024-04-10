import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isPalindrome(num)) {
            System.out.println(num + "is a palindrome number.");

        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
        public static boolean isPalindrome(int number){
            int reversedNumber=0;
            int originalNumber=number;

            while (number >0){
                int lastDigit=number %10;
                reversedNumber= reversedNumber *10 +lastDigit;
                number /=10;
            }
            return originalNumber== reversedNumber;
        }


}
