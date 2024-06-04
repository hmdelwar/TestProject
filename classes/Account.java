package classes;
import java.util.Scanner;

//public class Account {
//
//    private int accountNumber;
//    private double balance;
//    private String name, phone, email;
//    Scanner s = new Scanner(System.in);
//
//    Account(){
//
//    }
//    Account(int x, String y){
//        setAccountNumber(x);
//        setName(y);
//    }
//
//    public int getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(int accountNumber) {
//        String x = Integer.toString(accountNumber);
//        if (x.length() >8 && x.length() < 11) {
//            this.accountNumber = accountNumber;
//        }
//        else{
//            System.out.println("Enter a valid acct number");
//            setAccountNumber(s.nextInt());
//        }
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        if(balance >=0) this.balance = balance;
//        else{
//            System.out.println("Enter a positive amount to enter: ");
//            setBalance(s.nextDouble());
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void depositMoney(double am) {
//        balance+=am;
//
//    }
//
//    public void withdrawMoney(double am) {
//        if(am<= balance){
//            balance-=am;
//        }
//        else{
//            System.out.print("Your account contains less then the amount entered\nEnter how much would you like to withdraw: ");
//            withdrawMoney(s.nextDouble());
//        }
//
//    }
//}


/**
 A class for bank accounts.

 This class provides the basic functionality of accounts.
 It allows deposits and withdrawals but not overdraft
 limits or interest rates.
 @author Stuart Reynolds ... 1999
 */

public class Account
{
    private double bal;  //The current balance
    private int accnum;  //The account number


    public Account(int a)
    {
        bal=0.0;
        accnum=a;
    }

    public void deposit(double sum)
    {
        if (sum>0)
            bal+=sum;
        else
            System.err.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }

    public void withdraw(double sum)
    {
        if (sum>0)
            bal-=sum;
        else
            System.err.println("Account.withdraw(...): "
                    +"cannot withdraw negative amount.");
    }

    public double getBalance()
    {
        return bal;
    }

    public double getAccountNumber()
    {
        return accnum;
    }

    public String toString()
    {
        return "Acc " + accnum + ": " + "balance = " + bal;
    }

    public final void print()
    {
        //Don't override this,
        //override the toString method
        System.out.println( toString() );
    }

}