package java_8_To_17_Exercises;

public record PaymentSuccess(String transactionId) implements PaymentStatus{

    // Override the default method
    @Override
    public String getStatusMessage(){
        return "Success! Transaction ID: " + transactionId();
    }
}
