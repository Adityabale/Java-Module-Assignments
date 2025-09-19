/* You're developing error handling for a Java program that manages payments in an e-commerce application. Write
code to handle the following three, specific payment gateway errors: ● Timeout error: Implement exception handling to catch 
situations where the payment gateway response
times out. ● Invalid card details: Handle exceptions arising from attempts to process payments with invalid card
information.

● Insufficient funds: Implement exception handling to manage cases where users attempt to make payments
without sufficient funds in their account. */
// Timeout error
import java.util.Scanner;


class PaymentTimeoutException extends Exception {
    public PaymentTimeoutException(String message) {
        super(message);
    }
}

// Invalid card details
class InvalidCardException extends Exception {
    public InvalidCardException(String message) {
        super(message);
    }
}

// Insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class PaymentGateway {
    public void processPayment(String cardNumber, double amount, boolean simulateTimeout)
            throws PaymentTimeoutException, InvalidCardException, InsufficientFundsException {

        // Simulate timeout
        if (simulateTimeout) {
            throw new PaymentTimeoutException("Payment gateway timed out. Please try again.");
        }

        // Validate card number (simple check)
        if (cardNumber == null || cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            throw new InvalidCardException("Invalid card details provided.");
        }

        // Simulate insufficient funds
        double accountBalance = 500.0;
        if (amount > accountBalance) {
            throw new InsufficientFundsException("Insufficient funds in account.");
        }

        // If all checks pass
        System.out.println("Payment of ₹" + amount + " processed successfully.");
    }
}



public class PaymentApplicationException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentGateway gateway = new PaymentGateway();

        System.out.print("Enter card number (16 digits): ");
        String cardNumber = sc.nextLine();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        System.out.print("Simulate timeout? (true/false): ");
        boolean simulateTimeout = sc.nextBoolean();

        try {
            gateway.processPayment(cardNumber, amount, simulateTimeout);
        } catch (PaymentTimeoutException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidCardException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Payment attempt completed.");
        }

        sc.close();
    }
}
