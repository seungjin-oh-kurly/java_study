package chapter_11.sec06;

public class AccountExample {

    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("account.getBalance() = " + account.getBalance());

        try {
            account.withdraw(123123213);
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
    }
}

