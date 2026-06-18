import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    private double withdrawAmount;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public void withdraw() {
        System.out.println("\nAccount Holder : " + accountHolder);

        if (withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Insufficient Balance");
        }

        System.out.println("Remaining Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount ba = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        ba.setAccountHolder(sc.nextLine());

        System.out.print("Enter Balance: ");
        ba.setBalance(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        ba.setWithdrawAmount(sc.nextDouble());

        ba.withdraw();
    }
}
