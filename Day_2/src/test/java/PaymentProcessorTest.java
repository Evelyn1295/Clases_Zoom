/**import org.junit.jupiter.api.BeforeAll;
import javax.naming.CannotProceedException;
import static org.junit.jupiter.api.Assertions.*;*/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class PaymentProcessorTest {

    @Test
    void notBalanceSellerTest() {
        Account buyer = new Account("Andres","españa",100,"ES111111111111");
        Account seller = new Account("Maria","españa",50,"ES111111111111");
        PaymentProcessor pay = new PaymentProcessor();

        assertThrows(notBalanceException.class, () -> pay.issueRefund(buyer,seller,70,50));
    }

    @Test
    void notBalanceSeller2Test() {
        Account buyer = new Account("Andres","españa",50,"ES111111111111");
        Account seller = new Account("Maria","españa",25,"ES111111111111");
        PaymentProcessor pay = new PaymentProcessor();

        assertThrows(notBalanceException.class, () -> pay.issueRefund(buyer,seller,70,50));
    }

    @Test
    void notBalanceBuyerTest() {
        Account buyer = new Account("Andres","españa",20,"ES111111111111");
        Account seller = new Account("Maria","españa",50,"ES111111111111");
        PaymentProcessor pay = new PaymentProcessor();

        assertThrows(notBalanceException.class, () -> pay.processTaxedPurchase(buyer,seller,10));
        System.out.println(buyer.getBalance());

    }

    @Test
    void notBalanceBuyer2Test() {
        Account buyer = new Account("Andres","españa",10,"ES111111111111");
        Account seller = new Account("Maria","españa",70,"ES111111111111");
        PaymentProcessor pay = new PaymentProcessor();

        assertThrows(notBalanceException.class, () -> pay.processTaxedPurchase(buyer,seller,10));
        System.out.println(buyer.getBalance());

    }

    @Test
    void balanceTaxedExemptTest() {
        Account buyer = new Account("Andres","españa",5,"ES111111111111");
        Account seller = new Account("Maria","españa",50,"ES111111111111");
        PaymentProcessor pay = new PaymentProcessor();

        assertThrows(notBalanceException.class, () -> pay.processTaxExemptPurchase(buyer,seller,10));
        System.out.println(buyer.getBalance());

    }

    @Test
    void balanceTaxedExempt2Test() {
        Account buyer = new Account("Andres","españa",3,"ES111111111111");
        Account seller = new Account("Maria","españa",50,"ES111111111111");
        PaymentProcessor pay = new PaymentProcessor();

        assertThrows(notBalanceException.class, () -> pay.processTaxExemptPurchase(buyer,seller,5));

    }

}
