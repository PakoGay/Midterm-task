import java.util.*;

public class PaymentFactory {
    public static PaymentMethod createPaymentMethod(String method, Scanner in) throws Exception {
        switch(method.toLowerCase()) {
            case "creditcard":
                System.out.print("Enter card number: ");
                String cardNumber = in.nextLine();
                System.out.print("Enter the cardholder's name: ");
                String cardHolder = in.nextLine();
                System.out.print("Enter expiration date (MM/YY): ");
                String expiry = in.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = in.nextLine();
                return new CreditCardPayment(cardNumber, cardHolder, expiry, cvv);
            case "paypal":
                System.out.print("Enter email PayPal: ");
                String email = in.nextLine();
                System.out.print("Enter password PayPal: ");
                String password = in.nextLine();
                return new PayPalPayment(email, password);
            case "crypto":
                System.out.print("Enter your crypto wallet address: ");
                String walletAddress = in.nextLine();
                return new CryptoPayment(walletAddress);
            default:
                throw new Exception("Invalid payment method");
        }
    }
}