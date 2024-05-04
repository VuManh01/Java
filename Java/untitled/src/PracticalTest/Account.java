package PracticalTest;

import java.util.Scanner;

class Account {
    public String customerCode;
    public String customerName;
    public int accNumber;
    public long amount;

    public Account() {
        this.customerCode = "";
        this.customerName = "";
        this.accNumber = 0;
        this.amount = 0;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter customer code (5 characters): ");
            String code = scanner.nextLine();
            if (code.length() == 5) {
                this.customerCode = code;
                break;
            } else {
                System.out.println("Customer code must be 5 characters long. Please try again.");
            }
        }
        while (true) {
            System.out.print("Enter account number (6 digits starting with 100): ");
            int number = scanner.nextInt();
            if (String.valueOf(number).length() == 6 && String.valueOf(number).startsWith("100")) {
                this.accNumber = number;
                break;
            } else {
                System.out.println("Account number must be 6 digits and start with '100'. Please try again.");
            }
        }
        scanner.nextLine();
        System.out.print("Enter customer name: ");
        this.customerName = scanner.nextLine();
    }
    public void depositAndWithdraw(long amount, int type) {
        if (type == 0) {
            if (amount > 0) {
                this.amount += amount;
            }
        }else if (type == 1) {
            if (amount > 0 && amount < this.amount) {
                this.amount -= amount;
            } else {
                System.out.println("non-sufficient funds");
            }
        }
    }

    @Override
    public String toString() {
        return "Account Details:" +
                "\nCustomer Code: " + customerCode +
                "\nCustomer Name: " + customerName +
                "\nAccount Number: " + accNumber +
                "\nAmount: " + amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 0 to deposit money, 1 to withdraw money: ");
        int type = scanner.nextInt();
        long amount;
        do {
            System.out.print("Enter the amount for the transaction: ");
            amount = scanner.nextLong();
            if (amount <= 0) {
                System.out.println("Invalid amount for deposit. Please enter a positive number.");
            }
        } while (amount <= 0);

        account.depositAndWithdraw(amount, type);
        System.out.println(account.toString());
    }
}
