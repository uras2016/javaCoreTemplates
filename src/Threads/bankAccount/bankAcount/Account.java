package Threads.bankAccount.bankAcount;

public class Account {

    private int balance;


    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }

    public int getBalance(){
        return balance;
    }


}
