import java.util.*;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private String cvv;
    public CreditCardPayment(String cardNumber, String cardHolder, String expiry, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiry = expiry;
        this.cvv = cvv;
    }
    public String processPayment(double amount) throws Exception {
        System.out.println("Wait...");
        CreditCardValidatorAdapter adapter = new CreditCardValidatorAdapter(cardNumber, cardHolder, expiry, cvv);
        if (!adapter.validate()) {
            throw new Exception("Error");
        }
        String[] outcomes = {"completed", "failed"};
        String status = outcomes[new Random().nextInt(outcomes.length)];
        System.out.println("Pay with Credit card " + status);
        return status;
    }
}