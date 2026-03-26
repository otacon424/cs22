package chapter2;

public class BankAccount{
    private String id;
    private double balance;
    private int transactions;
    
    public BankAccount(String id)
    {
        this.id = id;
        this.balance = 0.0;
        this.transactions = 0;
    }



    public int getTransactions() {
        return transactions;
    }

    public String getId() {
        return id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransactions(int transactions) {
        this.transactions = transactions;
    }

    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    
    public boolean transactionFee(double fee)
    {
        double totalFees = 0.0;

        for(int i = 1; i <= this.transactions; i++)
        {
            totalFees += i * fee;
        }

        if(this.balance > totalFees)
        {
            this.balance -= totalFees;
            return true;
        }
        else{
            this.balance = 0.0;
            return false;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                '}';
    }
}
