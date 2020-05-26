public class Account {

    /**
     * Use the Red Green Refactor methodology. Write your tests first, then write the minimum amount of code needed to pass them,
     * then refactor for efficiency. Your tests should cover positive and negative cases including Exceptions.
     * Begin by Creating 2 classes Account and PaymentProcessor.
     * The Account class should have name, address, balance, and accountNumber properties with getters and setters.
     * The PaymentProcessor class should have a processTaxExemptPurchase method that takes in 2 Accounts (a buyer and seller) and a purchaseAmount.
     * The purchaseAmount should be deducted from the buyer Account balance and added to the seller Account balance.
     * The PaymentProcessor class should also have a processTaxedPurchase method.
     * This should have the same parameters as the processTaxExemptPurchase method but should add a 14% tax to
     * the purchaseAmount then deduct that sum from buyer balance and add it to seller balance.
     * The PaymentProcessor class should have an issueRefund method that takes in a buyer, seller, purchaseAmount, and integer percent.
     * The specified percent of the purchaseAmount should be transfered from the seller to the buyer.
     * **/

    private String name;
    private String address;
    private double balance;
    private String accountNumber;

    public Account(String name, String address, double balance, String accountNumber) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
