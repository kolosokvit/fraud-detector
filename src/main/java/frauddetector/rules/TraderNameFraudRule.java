package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderNameFraudRule implements FraudRule {

    private final String RULE_NAME = "Trader name fraud";
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

    public String getRuleName() {
        return RULE_NAME;
    }
}
