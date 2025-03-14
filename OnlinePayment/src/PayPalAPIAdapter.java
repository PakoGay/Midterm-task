public class PayPalAPIAdapter {
    private String email;
    private String password;
    private ExternalPayPalAPI api;
    public PayPalAPIAdapter(String email, String password) {
        this.email = email;
        this.password = password;
        this.api = new ExternalPayPalAPI();
    }
    public boolean makePayment(double amount) {
        if (!api.login(email, password)) {
            System.out.println("Unable to log in to PayPal");
            return false;
        }
        return api.sendPayment(email, amount);
    }
}