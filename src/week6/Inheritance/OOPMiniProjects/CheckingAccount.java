package week6.Inheritance.OOPMiniProjects;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder,balance);
    }

    @Override
    public void withdraw(double amount){
        double transFee =  1.00;
        System.out.println(getBalance() - transFee - amount);
    }
}
