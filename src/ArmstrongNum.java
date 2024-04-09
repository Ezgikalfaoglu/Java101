import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args){
        int number=1;
        int tempNumber= number;
        int digit= 0;
        int sumDigit=0;
        int digitValue;
        int digitPow;
        int armstrong = 0;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a number: ");
        number= scanner.nextInt();

        while (tempNumber!=0){
            tempNumber/=10;
            digit++;
        }
        tempNumber=number;

        while (tempNumber!=0){
            digitValue= tempNumber % 10;

            digitPow=1;
            for (int i=1; i<= digit; i++ ){
                digitPow *= digitValue;
            }

            sumDigit+=digitValue;

            armstrong+=digitPow;
            tempNumber/=10;

        }
        if(armstrong==number){
            System.out.println(number + "is a Armstrong number");
        }else{
            System.out.println(number + "is not a Armstrong number");

        }

        System.out.println("sum of digits of numbers are: "+ sumDigit);
    }

}
