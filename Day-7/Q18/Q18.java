class DepositOutOfBoundsException extends Exception{
    DepositOutOfBoundsException(String msg){
        super(msg);
    }
}
class WithdrawOutOfBoundsException extends Exception{
    WithdrawOutOfBoundsException(String msg){
        super(msg);
    }
}
public class Q18{
    public static void main(String[] args)throws DepositOutOfBoundsException,WithdrawOutOfBoundsException{
       BankAccount account1 = new BankAccount();
       account1.deposit(20000);
       account1.withdraw(5000);
       System.out.println(BankAccount.noOfAccounts);
    }
}
class BankAccount{
    int balance;
    static int noOfAccounts=0;
    BankAccount(){
        balance=0;
        noOfAccounts++;
    }
    void deposit(int money) throws DepositOutOfBoundsException{
        if(money>100000)
            throw new DepositOutOfBoundsException("More than 1 lac deposit is not allowed");
        if(money>0)
        balance+=money;
        System.out.println("Deposited succesfully");
    }
    void withdraw(int money) throws WithdrawOutOfBoundsException{
        if(money>balance)
            throw new WithdrawOutOfBoundsException("Withdraw more than present balance is not allowed");
        if(money>0)
        balance-=money;
        System.out.println("Withdraw succesfully");
    }
    int getBalance(){
        return balance;
    }
}
