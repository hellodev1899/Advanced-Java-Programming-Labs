package module2;

public class Account {
    private String name;
    private double mainBalance;

    public Account(String name, double mainBalance) {
        this.name = name;
        this.mainBalance = mainBalance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            mainBalance = mainBalance + amount;
        }
    }

    public String getName() {
        return name;
    }

    public double getMainBalance() {
        return mainBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "mainBalance=" + mainBalance +
                '}';
    }
}