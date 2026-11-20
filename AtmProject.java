// TODO:
// Roll Number: 202510418.
// Name : Mujtaba Mohammed Zakaria.

import java.util.Scanner;

public class AtmProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pin = 1234;
        int attempts = 0;
        int enteredPin;
        double balance = 1000;
        int choice;
        int count = 0;

        String[] history = new String[100];

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            enteredPin = input.nextInt();

            if (enteredPin == pin) {
                break;
            } else {
                attempts++;
                System.out.println("Wrong PIN");
            }
        }

        if (attempts == 3) {
            System.out.println("Account locked");
        } else {
            do {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transactions");
                System.out.println("5. Exit");
                System.out.print("Choose: ");

                choice = input.nextInt();

                if (choice == 1) {
                    System.out.println("Balance: " + balance);

                } else if (choice == 2) {
                    System.out.print("Enter amount: ");
                    double amount = input.nextDouble();

                    if (amount > 0) {
                        balance += amount;
                        history[count++] = "Deposit: " + amount;
                        System.out.println("Deposit successful");
                    } else {
                        System.out.println("Invalid amount");
                    }

                } else if (choice == 3) {
                    System.out.print("Enter amount: ");
                    double amount = input.nextDouble();

                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        history[count++] = "Withdraw: " + amount;
                        System.out.println("Withdrawal successful");
                    } else {
                        System.out.println("Insufficient balance");
                    }

                } else if (choice == 4) {
                    for (int i = 0; i < count; i++) {
                        System.out.println(history[i]);
                    }

                } else if (choice == 5) {
                    System.out.println("Thank You For Useing Our Bank");

                } else {
                    System.out.println("Invalid choice");
                }

            } while (choice != 5);
        }

        input.close();
    }
}
