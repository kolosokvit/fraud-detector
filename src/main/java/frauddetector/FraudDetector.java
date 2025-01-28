package frauddetector;

import frauddetector.rules.TraderCityFraudRule;
import frauddetector.rules.TraderCountryAndAmountFraudRule;
import frauddetector.rules.TraderCountryFraudRule;
import frauddetector.rules.TraderNameFraudRule;
import frauddetector.rules.TransactionAmountFraudRule;

import java.util.List;

public class FraudDetector {
    public FraudRule rule1 = new TraderNameFraudRule();
    public FraudRule rule2 = new TransactionAmountFraudRule();
    public FraudRule rule3 = new TraderCityFraudRule();
    public FraudRule rule4 = new TraderCountryFraudRule();
    public FraudRule rule5 = new TraderCountryAndAmountFraudRule();

    private List<FraudRule> fraudRules = List.of(rule1, rule2, rule3, rule4, rule5);

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

    FraudDetectionResult isFraudStream(Transaction transaction) {
        return fraudRules.stream()
                .filter(fraudRule -> fraudRule.isFraud(transaction))
                .findFirst()
                .map(this::buildFraudResult)
                .orElse(buildNotFraudResult());
    }

    private FraudDetectionResult buildNotFraudResult() {
        return new FraudDetectionResult(false, null);
    }

    private FraudDetectionResult buildFraudResult(FraudRule fraudRule) {
        return new FraudDetectionResult(true, fraudRule.getRuleName());
    }
}
