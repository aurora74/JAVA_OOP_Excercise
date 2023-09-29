import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * deposit function.
     *
     * @param amount xyz
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        }
    }

    /**
     * withdraw function.
     *
     * @param amount xyz
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
        }
    }

    /**
     * add transaction function.
     *
     * @param amount xyz
     * @param operation xyz
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * abc xyz.
     *
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            System.out.print("Giao dich " + (i + 1) + ": ");
            if (transitionList.get(i).getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Nap tien $");
            }
            if (transitionList.get(i).getOperation().equals(Transaction.WITHDRAW)) {
                System.out.print("Rut tien $");
            }
            System.out.printf("%.2f. ", transitionList.get(i).getAmount());
            System.out.print("So du luc nay: $"
                    + String.format("%.2f.", transitionList.get(i).getBalance()));
            System.out.println();
        }
    }
}