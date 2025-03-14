import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionLogger {
    private List<String> transactions;
    public TransactionLogger() {
        transactions = new ArrayList<>();
    }
    public void log(String paymentMethod, double amount, String status) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String transaction = "Payment method: " + paymentMethod + ", Amount: $" + amount +
                ", Status: " + status + ", Time: " + timestamp;
        transactions.add(transaction);
        System.out.println("The transaction has been committed: " + transaction);
    }
}