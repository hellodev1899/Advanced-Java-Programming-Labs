package module2;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account ac1 = new Account("Abhishek", 50000);
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Welcome %s, you have %.2f\nEnter deposit amount: ",ac1.getName(),ac1.getMainBalance());
        double amount = scanner.nextDouble();
        ac1.deposit(amount);
        System.out.printf("Deposit Success, you have: %.2f",ac1.getMainBalance());
    }
}