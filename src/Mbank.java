public class Mbank extends Phone {
    private int balance;

    public void getBalance() {
        System.out.println("Баланс: $" + balance);
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public void addBalance(int sum) {
        balance += sum;
    }

    public void transaction(int transactionSum, Mbank secondAccount) {
        if (transactionSum > 0 && transactionSum < balance) {
            balance -= transactionSum;
            secondAccount.setBalance(transactionSum);
        }
    }
}
