public class BankAccount {
    int accountNumber;
    double balance;
    double interestRate;

    BankAccount(){
    }
    BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        interestRate = 5;
    }

    void deposit(double balance) {
        this.balance = this.balance + balance;
    }

    void withdraw(double balance) {
        this.balance = this.balance - balance;
    }
    double interest(double time){
        return (time*balance*interestRate);
    }
}
