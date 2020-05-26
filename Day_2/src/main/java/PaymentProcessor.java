public class PaymentProcessor {
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
    //private double purchaseAmount;

    public PaymentProcessor(){

    }

    public void processTaxExemptPurchase(Account buyer, Account seller, double purchaseAmount) throws notBalanceException {
        if(buyer.getBalance() < purchaseAmount){
            throw new notBalanceException("No hay suficiente saldo por parte del buyer");
        }
        buyer.setBalance(buyer.getBalance()-purchaseAmount);
        seller.setBalance(seller.getBalance() + purchaseAmount);
    }

    public void processTaxedPurchase(Account buyer, Account seller, double purchaseAmount) throws notBalanceException{

        double taxPrice = purchaseAmount*(1 + 0.14);

        if(buyer.getBalance()< purchaseAmount + taxPrice){
            throw new notBalanceException("No hay suficiente saldo por parte del buyer");
        }

        buyer.setBalance(buyer.getBalance() - taxPrice);
        seller.setBalance(seller.getBalance() + taxPrice);
    }

    public void issueRefund(Account buyer, Account seller, double purchaseAmount,int percent) throws notBalanceException {

        double percentD = percent/100;
        double refundPrice = purchaseAmount*(1 - percentD);

        if(seller.getBalance() < refundPrice){
            throw new notBalanceException("No hay suficiente saldo por parte del seller");
        }

        buyer.setBalance(buyer.getBalance() + refundPrice);
        seller.setBalance(seller.getBalance() - refundPrice);
    }
}
