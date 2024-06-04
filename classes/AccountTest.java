package classes;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();


        SavingAccount a = new SavingAccount(123456789, "Hossain");
        a.setBalance(100);
        a.addInterest(2.20);
        for(int i = 0; i<5; i++) a.withdrawMoney(2);
        System.out.println(a.getBalance());
    }
}
