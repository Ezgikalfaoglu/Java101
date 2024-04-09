import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args){
        String userName, password;
        int right= 3;
        int balance=1500;
        int totalPrice;
        int select;


        while (right>0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your username: ");
            userName = scanner.nextLine();
            System.out.print("Please enter your password: ");
            password = scanner.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Hello, welcome to Kodluyoruz Bank");
                do {
                    System.out.println("1- Deposit");
                    System.out.println("2- Withdraw money");
                    System.out.println("3- Check balance");
                    System.out.println("4- Exit from the app");
                    System.out.print("Please select a number:  ");
                    select=scanner.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Please select the deposit value: ");
                            totalPrice=scanner.nextInt();
                            balance+=totalPrice;
                            break;
                        case 2:
                            System.out.print("Please select the withdraw value: ");
                            totalPrice=scanner.nextInt();
                            if (select > balance) {
                                System.out.println("Your balance is not enough.");
                            }else
                                balance-=totalPrice;
                            break;
                        case 3:
                            System.out.println("Your balance is: " +balance);
                            break;

                    }





                }while (select!=4);
                System.out.println("See you again!");
                break;
            }else {
                right--;
            }
            if (right==0){
                System.out.println("Your account has been blocked, Please contact with your Bank");
            }else{
                System.out.println("Your remaining rights: " +right);
            }
        }




    }
}
