package frauddetector.rules;

import frauddetector.FraudRule;
import frauddetector.Transaction;

public class TraderCountryAndAmountFraudRule implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }
}
