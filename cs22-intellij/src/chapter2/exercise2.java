/*
Suppose that you are provided with a pre-written class BankAccount as shown below. (The headings are shown, but not the method bodies, to save space.)
 Assume that the fields, constructor, and methods shown are already implemented. You may refer to them or use them in solving this problem if necessary.

Write an instance method named transactionFee that will be placed inside the BankAccount class to become a part of each BankAccount object's behavior.
he transactionFee method accepts a fee amount (a real number) as a parameter, and applies that fee to the user's past transactions. The fee is applied once
for the first transaction, twice for the second transaction, three times for the third, and so on. These fees are subtracted out from the user's overall balance.
If the user's balance is large enough to afford all of the fees with greater than $0.00 remaining, the method returns true.
If the balance cannot afford all of the fees or has no money left, the balance is left as 0.0 and the method returns false.
 */
package chapter2;
import chapter2.BankAccount;

public class exercise2 {

    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount("Tester");
        savings.setTransactions(2);
        savings.deposit(500);
        savings.transactionFee(2.0);
        System.out.println(savings.toString());
        savings.transactionFee(5.0);
        savings.withdraw(300);
        savings.transactionFee(10.00);

        System.out.println(savings.toString());
    }
}
