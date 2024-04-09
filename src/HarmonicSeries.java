import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args){
        int n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n value: ");
        n= scanner.nextInt();
        double result=0;

        for (double i= 1; i<=n; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
