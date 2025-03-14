import java.util.*;

public class PaymentGateway {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TransactionLogger logger = new TransactionLogger();
        System.out.println("Select payment method:");
        System.out.println("1.Credit card");
        System.out.println("2.PayPal");
        System.out.println("3.Cryptocurrency");
        String choice = in.nextLine();
        System.out.print("Enter the payment amount: ");
        double amount = Double.parseDouble(in.nextLine());
        PaymentMethod paymentMethod = null;
        try {
            switch(choice) {
                case "1":
                    paymentMethod = PaymentFactory.createPaymentMethod("creditcard", in);
                    break;
                case "2":
                    paymentMethod = PaymentFactory.createPaymentMethod("paypal", in);
                    break;
                case "3":
                    paymentMethod = PaymentFactory.createPaymentMethod("crypto", in);
                    break;
                default:
                    System.out.println("Error");
                    in.close();
                    return;
            }
            System.out.println("Processing payment in the amount of $" + amount);
            String status = paymentMethod.processPayment(amount);
            logger.log(paymentMethod.getClass().getSimpleName(), amount, status);
        } catch (Exception e) {
            System.out.println("Error processing payment: " + e.getMessage());
            logger.log("Error", amount, "failed");
        }
        in.close();
    }
}