import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int n;
        int total=1;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n=scanner.nextInt();

        for (int i=1; i<=n; i++){
            total = total * i;
        }
        System.out.println(n+ ". Factorial : " + total);


    }
}
