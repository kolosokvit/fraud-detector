package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TransactionAmountFraudRule implements FraudRule {

    private final String RULE_NAME = "Transaction amount fraud";
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1_000_000;
    }

    public String getRuleName() {
        return RULE_NAME;
    }
}
