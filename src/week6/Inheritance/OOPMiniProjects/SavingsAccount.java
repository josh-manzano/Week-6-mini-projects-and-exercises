package week6.Inheritance.OOPMiniProjects;

public class SavingsAccount extends BankAccount{
    private int currentWDCnt;
    private int maxWDCnt = 2;
    double earnInterest =  1.1;

    public int getCurrentWDCnt() {
        return currentWDCnt;
    }

    public void setCurrentWDCnt(int currentWDCnt) {
        this.currentWDCnt = currentWDCnt;
    }

    public int getMaxWDCnt() {
        return maxWDCnt;
    }

    public void setMaxWDCnt(int maxWDCnt) {
        this.maxWDCnt = maxWDCnt;
    }

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder,balance);
    }

    @Override
    public void withdraw(double amount){
        if ( getMaxWDCnt() >= currentWDCnt){
            setBalance(getBalance() - amount);
        }
    }

    public void addedInterest(){
        setBalance(getBalance() * (1 +  earnInterest));
    }
}