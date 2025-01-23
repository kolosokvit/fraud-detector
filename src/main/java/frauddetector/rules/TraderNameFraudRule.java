package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderNameFraudRule implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }
}
