package frauddetector;

public interface FraudRule {
    boolean isFraud(Transaction transaction);
}
