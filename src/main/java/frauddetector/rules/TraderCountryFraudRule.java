package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderCountryFraudRule implements FraudRule {

    private final String RULE_NAME = "Trader country fraud";
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }

    public String getRuleName() {
        return RULE_NAME;
    }
}
