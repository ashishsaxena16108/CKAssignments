import java.io.*;
import java.util.*;
import java.lang.Override;
public class Q7{
    public static void main(String[] args) {
         BankAccount account = new BankAccount(12345,"Shung Lee",0);
         System.out.println(account);
    }
}
class BankAccount{
    private int accountNumber;
    private String holderName;
    private int balance;

    public BankAccount(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
