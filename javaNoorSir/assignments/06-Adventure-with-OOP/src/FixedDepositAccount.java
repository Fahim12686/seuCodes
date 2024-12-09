public class FixedDepositAccount extends BankAccount{
    FixedDepositAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        interestRate = 6.0;
    }
}
