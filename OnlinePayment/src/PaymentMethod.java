public interface PaymentMethod {
    String processPayment(double amount) throws Exception;
}
