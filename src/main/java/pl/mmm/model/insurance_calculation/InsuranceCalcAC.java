package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public class InsuranceCalcAC implements InsuranceCalc {

    @Override
    public BigDecimal calculateInsuranceCosts(InsuranceFactors factors) {
        BigDecimal baseCosts = factors.getBaseCosts();
        BigDecimal estimatedCarPrice = factors.getEstimatedCarPrice();

        BigDecimal totalCost = BigDecimal.ZERO;
        totalCost = totalCost.add(baseCosts);
        BigDecimal percentage = factors.getPercentage();
        BigDecimal ratio = convertPercentageToRatio(percentage);
        totalCost = totalCost.add(estimatedCarPrice.multiply(ratio));
        return totalCost;
    }

    private BigDecimal convertPercentageToRatio(BigDecimal percentage) {
        return new BigDecimal("0.01").multiply(percentage);
    }
}
