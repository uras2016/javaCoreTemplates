package Threads.bankAcount;

import javax.naming.InsufficientResourcesException;

public class Operations {

    public static void main(String[] args) {


        final Account a = new Account(1000);
        final Account b = new Account(2000);

        new Thread(new Runnable() {

            public void run() {

//                transfer(a, b, 500);

            }
        }).start();
//        transfer(b, a, 300);

    }

    static void transfer(Account a, Account b, int amount) throws InsufficientResourcesException, InterruptedException {
        if (a.getBalance() < amount) {
            throw new InsufficientResourcesException();
        }

        synchronized (a) {
            Thread.sleep(1000);
            synchronized (b) {
                a.withdraw(amount);
                b.deposit(amount);
            }
        }
    }
}
