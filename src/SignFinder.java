import java.util.Scanner;
public class SignFinder {
    public static void main(String[] args){
        int month, day;
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a month: ");
        month= scanner.nextInt();

        System.out.println("Please enter a day: ");
        day= scanner.nextInt();

        switch (month){
            case 1:
                if (day>=1 && day <= 31){
                    if (day<22){
                        System.out.println("Your sign is Capricorn");
                    }else{
                        System.out.println("Your sign is Aquarius");
                    }
                }
                break;
            case 2:
                if (day>=1 && day <= 28){
                    if (day<20){
                        System.out.println("Your sign is Aquarius");
                    }else{
                        System.out.println("Your sign is Pisces");
                    }
                }
                break;
            case 3:
                if (day>=1 && day <= 31){
                    if (day<21){
                        System.out.println("Your sign is Pisces");
                    }else{
                        System.out.println("Your sign is Aries");
                    }
                }
                break;
            case 4:
                if (day>=1 && day <= 30){
                    if (day<21){
                        System.out.println("Your sign is Aries" );
                    }else{
                        System.out.println("Your sign is Taurus");
                    }
                }
                break;
            case 5:
                if (day>=1 && day <= 31){
                    if (day<22){
                        System.out.println("Your sign is Taurus");
                    }else{
                        System.out.println("Your sign is Gemini");
                    }
                }
                break;
            case 6:
                if (day>=1 && day <= 30){
                    if (day<23){
                        System.out.println("Your sign is Gemini");
                    }else{
                        System.out.println("Your sign is Cancer");
                    }
                }
                break;
            case 7:
                if (day>=1 && day <= 31){
                    if (day<23){
                        System.out.println("Your sign is Cancer");
                    }else{
                        System.out.println("Your sign is Leo");
                    }
                }
                break;
            case 8:
                if (day>=1 && day <= 30){
                    if (day<23){
                        System.out.println("Your sign is Leo");
                    }else{
                        System.out.println("Your sign is Virgo");
                    }
                }
                break;
            case 9:
                if (day>=1 && day <= 31){
                    if (day<23){
                        System.out.println("Your sign is Virgo");
                    }else{
                        System.out.println("Your sign is Libra");
                    }
                }
                break;
            case 10:
                if (day>=1 && day <= 30){
                    if (day<23){
                        System.out.println("Your sign is Libra");
                    }else{
                        System.out.println("Your sign is Scorpio");
                    }
                }
                break;
            case 11:
                if (day>=1 && day <= 31){
                    if (day<23){
                        System.out.println("Your sign is Scorpio");
                    }else{
                        System.out.println("Your sign is Sagittarius");
                    }
                }
                break;
            case 12:
                if (day>=1 && day <= 30){
                    if (day<22){
                        System.out.println("Your sign is Sagittarius");
                    }else{
                        System.out.println("Your sign is Capricorn");
                    }
                }
                break;
            case 13:
                if (day>=1 && day <= 31){
                    if (day<22){
                        System.out.println("Your sign is Capricorn");
                    }else{
                        System.out.println("Your sign is Aquarius");
                    }
                }
                break;


                default:
                System.out.println("You entered an incorrect month!");
        }
    }
}
