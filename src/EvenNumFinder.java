import java.util.Scanner;

public class EvenNumFinder {
    public static void main(String[] args){
        int a;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:" );
        a= scanner.nextInt();


        for (int i=1; i<=a; i++){
            if(i % 2==0){
                System.out.println(i);
            }
        }
    }
}
