public class CreditCardValidatorAdapter {
    private String cardNumber;
    private String cardHolder;
    private String expiry;
    private String cvv;
    private CreditCardValidator validator;
    public CreditCardValidatorAdapter(String cardNumber, String cardHolder, String expiry, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiry = expiry;
        this.cvv = cvv;
        this.validator = new CreditCardValidator();
    }
    public boolean validate() {
        return validator.validateCard(cardNumber, cardHolder, expiry, cvv);
    }
}