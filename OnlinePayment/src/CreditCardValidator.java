class CreditCardValidator {
    public boolean validateCard(String cardNumber, String cardHolder, String expiry, String cvv) {
        System.out.println("Credit card validation via external API......");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        return cvv.equals("123");
    }
}