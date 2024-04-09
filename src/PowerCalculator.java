import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args){
        int n,k;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number to be exponential: ");
        n=scanner.nextInt();
        System.out.print("Enter the number to be the exponent: ");
        k=scanner.nextInt();

        int total=1;

        for (int i=1; i<=k; i++){
            total *=n;
        }
        System.out.println("Answer: "+ total);

    }
}
