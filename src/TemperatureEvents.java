import java.util.Scanner;

public class TemperatureEvents
{
    public static void main(String[] args){
        int winter, summer, spring, autm;
        int tempperature = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a temperature value: ");
        int temperature = scanner.nextInt();
        if (temperature < 5) {
            System.out.println("Do ski!");
        } else if (temperature > 5 && temperature < 15)
            System.out.println("Go to the cinema!");
        else if (temperature > 15 && temperature < 25) {
            System.out.println("Go to the picnic!");
        } else {
            System.out.println("Go to the swimming!");

        }


    }
}
