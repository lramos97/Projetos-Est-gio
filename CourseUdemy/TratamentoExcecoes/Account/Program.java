package CourseUdemy.TratamentoExcecoes.Account;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.println("Enter amount for deposit: ");
        double amountDeposited = sc.nextDouble();

        try {
            acc.deposit(amountDeposited);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        try {
            acc.withdraw(amount);
            System.out.printf("New balance: %.2f%n", acc.getBalance());
        }
        catch (AccountException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
