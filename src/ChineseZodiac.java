import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args){
        int year, YourSign;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        year= scanner.nextInt();

        YourSign = year % 12;

        if (YourSign==0){
            System.out.println("Your Chinese Zodiac is: Monkey");

        } else if (YourSign==1) {
            System.out.println("Your Chinese Zodiac is: Cockerel");

        }else if (YourSign==2) {
            System.out.println("Your Chinese Zodiac is: Dog");

        }else if (YourSign==3) {
            System.out.println("Your Chinese Zodiac is: Pig");

        }else if (YourSign==4) {
            System.out.println("Your Chinese Zodiac is: Mouse");

        }else if (YourSign==5) {
            System.out.println("Your Chinese Zodiac is: Ox");

        }else if (YourSign==6) {
            System.out.println("Your Chinese Zodiac is: Tiger");

        }else if (YourSign==7) {
            System.out.println("Your Chinese Zodiac is: Rabbit");

        }else if (YourSign==8) {
            System.out.println("Your Chinese Zodiac is: Dragon");

        }else if (YourSign==9) {
            System.out.println("Your Chinese Zodiac is: Snake");

        }else if (YourSign==10) {
            System.out.println("Your Chinese Zodiac is: Horse");

        }else if (YourSign==11) {
            System.out.println("Your Chinese Zodiac is: Sheep");

        }else{
            System.out.println("You entered invalid date, please try again.");
        }


    }
}
