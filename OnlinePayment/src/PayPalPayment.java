public class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public String processPayment(double amount) throws Exception {
        System.out.println("Wait...");
        PayPalAPIAdapter adapter = new PayPalAPIAdapter(email, password);
        if (!adapter.makePayment(amount)) {
            throw new Exception("Error");
        }
        String status = "completed";
        System.out.println("Pay with PayPal " + status);
        return status;
    }
}