import java.util.Scanner;

public class Combination {
    public static void main(String[] args){
        int fac1=1, fac2=1, fac3=1,n,r,combination;
        Scanner scanner= new Scanner(System.in);

        System.out.print("please enter your n value: ");
        n= scanner.nextInt();

        System.out.print("please enter your r value: ");
        r= scanner.nextInt();

        for (int i=1; i<=n; i++){
            fac1*=i;
        }
        for (int i=1; i<=r; i++){
            fac2*=i;
        }
        for (int i=1; i<=(n-r); i++){
            fac3*=i;
        }
        combination= fac1/(fac2*fac3);

        System.out.println("Combination of C(n,r): "+ combination);

    }
}
