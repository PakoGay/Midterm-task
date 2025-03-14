public class ExternalPayPalAPI {
    public boolean login(String email, String password) {
        System.out.println("Login to PayPal External API...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        return password.equals("paypalpass");
    }
    public boolean sendPayment(String email, double amount) {
        System.out.println("Sending payment via PayPal external API...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        return true;
    }
}