package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TransactionAmountFraudRule implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1_000_000;
    }
}
