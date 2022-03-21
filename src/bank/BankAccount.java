package bank;

public class BankAccount {
    private static int balance=0;

static void deposit(int amount){
        if (amount<0){
            System.out.println("You cannot deposit less than 0");
        }
        else{
            balance+=amount;
            String transaction=String.format("You deposited %s",amount );
            System.out.println(transaction);
        }
    }

 static void withdraw(int amount){
    if (amount>balance){
        String withdrawalMessage=String.format("You cannot withdraw %d",amount);
        System.out.println(withdrawalMessage);
    }
    else{
        balance-=amount;
        String withdrawalTransaction=String.format("You have withdrawn %d",amount);
        System.out.println(withdrawalTransaction);
    }
    }

    static void showBalance(){
    System.out.println("Hello your balance is "+ balance);
    }

  static void borrow(int amount){
    if (amount>0){
        String borrowMessage=String.format("You can borrow %d",amount);
        System.out.println(borrowMessage);
    }
    else{
        System.out.println("You cannot borrow less than zero");
    }
    }

  static void repayLoan(int amount){
    if (amount>0){
        String repayMessage=String.format("You have an outstanding debt of %d",amount);
        System.out.println(repayMessage);
    }
    else{
        System.out.println("You have cleared your debt!");
    }
    }

    public static void main(String[] args) {
     deposit(99);
     withdraw(8);
     withdraw(899);
     deposit(99999);
     withdraw(777);
     showBalance();
     borrow(7880);
     showBalance();
     repayLoan(777);
     borrow(0);
    }
}
