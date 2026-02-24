package java_8_To_17_Exercises;

public record PaymentFailure(String failureReason) implements PaymentStatus{

    // Override the default method (custom message)
    @Override
    public String getStatusMessage() {
        return "Payment failed: " + failureReason();
    }
}
