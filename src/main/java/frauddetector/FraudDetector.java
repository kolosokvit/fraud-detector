package frauddetector;

import frauddetector.rules.TraderCityFraudRule;
import frauddetector.rules.TraderCountryAndAmountFraudRule;
import frauddetector.rules.TraderCountryFraudRule;
import frauddetector.rules.TraderNameFraudRule;
import frauddetector.rules.TransactionAmountFraudRule;

public class FraudDetector {
    public FraudRule rule1 = new TraderNameFraudRule();
    public FraudRule rule2 = new TransactionAmountFraudRule();
    public FraudRule rule3 = new TraderCityFraudRule();
    public FraudRule rule4 = new TraderCountryFraudRule();
    public FraudRule rule5 = new TraderCountryAndAmountFraudRule();

    boolean isFraud(Transaction transaction) {
        return rule1.isFraud(transaction) ||
                rule2.isFraud(transaction) ||
                rule3.isFraud(transaction) ||
                rule4.isFraud(transaction) ||
                rule5.isFraud(transaction);
    }
}
