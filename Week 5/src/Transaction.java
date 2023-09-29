public class Transaction {

    private String operation;

    private double amount;

    private double balance;

    public static final String DEPOSIT = "deposit";

    public static final String WITHDRAW = "withdraw";

    /**
     * Constructor.
     *
     * @param operation syz
     * @param amount xyz
     * @param balance xyz
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}