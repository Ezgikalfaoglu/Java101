import java.util.Scanner;

public class PlanePricer {
    public static void main(String[] args){
        int km,age,type;
        double price= 0.10;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the KM: ");
        km= scanner.nextInt();

        System.out.println("Please enter the age: ");
        age=scanner.nextInt();

        System.out.println("please enter your flight type (1 => one-way , 2 => round-trip)  ");
        type=scanner.nextInt();

      if (km<= 0 || age<=0 || (type!=1 && type!=2 ) ){
          System.out.println("You have logged in incorrectly!");
      }

      double totalCost= price*km;


      if (age<12){
          double NewPrice = totalCost - (totalCost * 0.5);
          System.out.println("New price for children: " + NewPrice);
      } else if (age>=12 && age<24) {
          double NewPrice= totalCost - (totalCost * 0.1);
          System.out.println("New price for Young Adults: "+ NewPrice);
      }else if (age>=65){
      double NewPrice= totalCost - (totalCost * 0.3);
      System.out.println("New price for elders: " + NewPrice);
    }
      if (type==2) {
          double NewPrice = totalCost - (totalCost * 0.2);
          System.out.println("An additional discount has been applied to your ticket since you purchased a roundtrip ticket: " + NewPrice);
      }
}
}