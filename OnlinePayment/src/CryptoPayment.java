import java.util.*;

public class CryptoPayment implements PaymentMethod {
    private String walletAddress;
    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }
    public String processPayment(double amount) throws Exception {
        System.out.println("Wait...");
        String[] outcomes = {"completed", "failed"};
        String status = outcomes[new Random().nextInt(outcomes.length)];
        System.out.println("Crypto payment " + status);
        return status;
    }
}
