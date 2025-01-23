package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderCountryFraudRule implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }
}
