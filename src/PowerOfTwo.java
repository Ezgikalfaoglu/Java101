import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args){
      int a;
      Scanner scanner= new Scanner(System.in);
      System.out.print("Enter the limit number: ");
      a= scanner.nextInt();


      for (int i = 1,b=1; i<=a; i*=4,b*=5){
          System.out.println(i);
          System.out.println(b);

        }

    }
}
