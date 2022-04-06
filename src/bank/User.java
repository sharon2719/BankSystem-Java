package bank;

public class User {
    private String name;
    private String role;
    private BankAccount bankAccount;

    public User(String name, String role){

        this.name = name;
        this.role = role;

    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public User(String name, String role, BankAccount bankAccount){

        this.name = name;
        this.role = role;
        this.bankAccount=bankAccount;    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
