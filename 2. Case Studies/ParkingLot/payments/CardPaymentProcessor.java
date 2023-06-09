package ParkingLot.payments;

public class CardPaymentProcessor implements PaymentProcessor {
    private final double amount;
    private final CardDetails cardDetails;

    public CardPaymentProcessor(double amount, CardDetails cardDetails) {
        this.amount = amount;
        this.cardDetails = cardDetails;
    }

    public boolean executePayment() {
        return false;
    }

    public CardDetails getCardDetails() {
        return cardDetails;
    }

    public double getAmount() {
        return amount;
    }
}
