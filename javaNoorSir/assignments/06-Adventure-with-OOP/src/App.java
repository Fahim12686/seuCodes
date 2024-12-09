public class App {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(103, 50000);
        SavingsAccount a2 = new SavingsAccount(73, 50000);
        DpsAccount a3 = new DpsAccount(98, 50000);
        FixedDepositAccount a4 = new FixedDepositAccount(105, 50000);

        System.out.println("For 5 year time interest for each account:");
        System.out.println("Bank Account: " + a1.interest(5) + "\nSavings Account: " + a2.interest(5)
                + "\nDps Account: " + a3.interest(5) + "\nFixed Deposit Account: " + a4.interest(5) + "\n");
    }
}
