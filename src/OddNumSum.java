import java.util.Scanner;
public class OddNumSum {
    public static void main(String[] args){
        int a;
        int total= 0;

        Scanner scanner= new Scanner(System.in);

        do {
            System.out.println("Enter a number: ");
            a = scanner.nextInt();
            if(a % 4 == 0){
                total = total +a;

            }

        }while (a % 2==0);{
            System.out.println("total: "+ total);
        }
    }
}
