package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderCountryAndAmountFraudRule implements FraudRule {
    private final String RULE_NAME = "Trader country and amount fraud";
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }

    public String getRuleName() {
        return RULE_NAME;
    }
}
