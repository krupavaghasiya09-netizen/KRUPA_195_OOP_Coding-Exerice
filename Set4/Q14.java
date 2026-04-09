import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest() {
        return balance * 0.04;
    }
}


class FixedDepositAccount extends BankAccount {
    double maturityAmount(int years) {
        return balance + (balance * 0.06 * years); 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingAccount sa = new SavingAccount();
        System.out.println("Saving Account:");
        sa.openAccount();
        sa.deposit(1000);
        sa.withdraw(500);
        sa.checkBalance();
        System.out.println("Interest: " + sa.calculateInterest());

       
        FixedDepositAccount fd = new FixedDepositAccount();
        System.out.println("\nFixed Deposit Account:");
        fd.openAccount();
        System.out.print("Enter number of years: ");
        int years = sc.nextInt();
        System.out.println("Maturity Amount: " + fd.maturityAmount(years));
    }
}
