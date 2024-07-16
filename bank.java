package Projects;
import java.util.Scanner;

public class banksystem {
    static double balance = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

      //using while loop
        while (option != 4){
            System.out.println("\n\n!!Welcome To The Online Banking System!!");
            System.out.println("Choose any option you want....");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");
            System.out.println("Enter your option:");
            option = sc.nextInt();

            switch (option){
                case 1: checkBalance();
                        break;

                case 2: depositMoney();
                        break;

                case 3: withdrawMoney();
                        break;

                case 4: exit();
                        break;

                default:
                    System.out.println("Invalid option. Please try again..");
                    break;
            }
        }
    }

    public static void checkBalance(){
        System.out.println("Your balance in the account is $" + balance);
    }

    public static void depositMoney(){
        Scanner sc = new Scanner(System.in);
        System.out.println("!!Deposit Money!!");
        System.out.println("Enter amount you want to deposit::");
        int money = sc.nextInt();
        balance += money;
        System.out.println("Your amount has been deposited..");
        System.out.println("Total amount in your account now is :" + balance);
    }

    public static void withdrawMoney(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount you want to withdraw from your account:");
        int withdraw = scanner.nextInt();
        if (withdraw < balance){
            balance -= withdraw;
            System.out.println("Your amount has been withdraw");
            System.out.println("Total amount in your account now is :" + balance);
        }
        else
            System.out.println("Sorry for inconvenience but your amount cannot be withdraw");
            System.out.println("Your account balance is minimum");
            System.out.println("Insufficient Balance! Please check your balance");
    }

    public static void exit(){
        System.out.println("Thanks for banking with us. Have a nice day!!");
    }
}

