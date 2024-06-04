package classes;

public class SavingAccount extends Account{
    int count =0;
    int withdrawLimit = 5;
    SavingAccount(int x, String y){
        super(x,y);
    }

    public void addInterest(double interestRate){
        depositMoney(getBalance()*0.22);
    }
    public void withdrawAmount(double x){
        if (getBalance() - x >= 100) {
            withdrawMoney(x);
        }
        else
            System.out.println("You have reached your limits for withdrawing");

    }

}
