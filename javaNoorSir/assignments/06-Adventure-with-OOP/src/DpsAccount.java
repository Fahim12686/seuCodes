public class DpsAccount extends BankAccount{
    DpsAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        interestRate = 7.0;
    }

}
