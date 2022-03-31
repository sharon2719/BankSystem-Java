package bank;

import java.util.Scanner;

public class MainBank extends BankAccount {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int userChoice;
        boolean quit=false;
        double accountBalance =0;
        do{
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check account balance");
            System.out.println("Your choice, 0 to quit");

            userChoice=scanner.nextInt();

            switch (userChoice){
                case 1:
                    double amount;
                    System.out.println("Amount to deposit: ");
                    amount=scanner.nextDouble();
                    if (amount<=0){
                        System.out.println("Can't deposit non-positive amount");
                    }
                    else{
                        accountBalance+=amount;
                        System.out.println("$" + amount +" has been deposited");
                    }
                    break;
                case 2:
                    System.out.println("Amount to withdraw: ");
                    amount=scanner.nextDouble();
                    if(amount<=0 ||amount >accountBalance){
                        System.out.println("Withdrawal can't be completed");
                    }
                    else {
                        accountBalance -= amount;
                        System.out.println("$" + amount + " has been withdrawn");
                    }
                    break;
                case 3:
                    System.out.println("Your balance: $" + accountBalance);
                    break;
                case 0 :
                    quit= true;
                    break;
                default:
                    System.out.println("Wrong choice.");
                    break;
            }
            System.out.println();
        }
        while (!quit);
        System.out.println("Bye!");
    }
}
