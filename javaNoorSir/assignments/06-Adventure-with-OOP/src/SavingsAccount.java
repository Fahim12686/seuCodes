public class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        interestRate = 2.0;
    }
}
