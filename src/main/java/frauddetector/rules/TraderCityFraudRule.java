package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderCityFraudRule implements FraudRule {
    private final String RULE_NAME = "Trader city fraud";
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sidney");
    }

    public String getRuleName() {
        return RULE_NAME;
    }
}
