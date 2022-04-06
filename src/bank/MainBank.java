package bank;

import java.util.HashMap;
import java.util.Scanner;

public class MainBank  {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        User user1=new User("Jane","Admin");
        User user2=new User("John","Account Holder",new BankAccount("John ","98767897","Kilimani",9000.0));

        HashMap<String,User> usersMap = new HashMap<>();

        usersMap.put(user1.getName(),user1);
        usersMap.put(user2.getName(),user2);

        System.out.println("Enter user name to log in:");
        String enterName;
        enterName=scanner.nextLine();
        User currentUser=null;
        if(usersMap.containsKey(enterName)){
            currentUser=usersMap.get(enterName);
        }
        else{
            System.out.println("User entered does not exist");
        }


        int userChoice;
        boolean quit=false;



        do{
            System.out.println("Choose from the options below:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check account balance");
            System.out.println("4. Create account");
            System.out.println("5. Close account");
            System.out.println("Your choice, 0 to quit");

            userChoice=scanner.nextInt();
            double amount;
            switch (userChoice){
                case 1:
                  if(currentUser.getBankAccount()!=null){

                      System.out.println("Amount to deposit: ");
                      amount=scanner.nextDouble();
                      if (amount<=0){
                          System.out.println("Can't deposit non-positive amount");
                      }
                      else{
                          currentUser.getBankAccount().deposit(amount);
                          System.out.println("KES" + amount +" has been deposited");
                      }
                  }
                  else{
                      System.out.println("You do not have an account to proceed.");
                  }
                    break;
                case 2:
                    if(currentUser.getBankAccount()!=null){

                        System.out.println("Amount to withdraw: ");
                        amount=scanner.nextDouble();
                        if(amount<=0 ||amount >currentUser.getBankAccount().getToDisplayAccountBalance()){
                            System.out.println("Withdrawal can't be completed");
                        }
                        else {
                            currentUser.getBankAccount().withdraw(amount) ;
                            System.out.println("KES" + amount + " has been withdrawn");
                        }
                    }
                    else{
                        System.out.println("You do not have an account to proceed.");
                    }
                    break;

                case 3:
                    if(currentUser.getBankAccount()!=null) {
                        System.out.println("Your balance: KES" + currentUser.getBankAccount().getToDisplayAccountBalance());
                    }
                    else{
                        System.out.println("You do not have an account to proceed.");
                    }
                    break;

                case 4:
                    if(currentUser.getRole().equals("Admin")){
                        System.out.println("You have successfully created an account");
                    }
                    else{
                        System.out.println("You need to be an admin user to create an account");
                    }

                    break;
                case 5:
                    if(currentUser.getRole().equals("Admin")){
                        System.out.println("You have successfully closed an account");
                    }
                    else{
                        System.out.println("You need to be an admin user to close an account");
                    }
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
