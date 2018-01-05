package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public class InsuranceCalcAC implements InsuranceCalc {

    @Override
    public BigDecimal calculateInsuranceCosts(InsuranceFactors factors) {
        BigDecimal baseCosts = factors.getBaseCosts();
        BigDecimal estimatedCarPrice = factors.getEstimatedCarPrice();

        BigDecimal totalCost = BigDecimal.ZERO;
        totalCost = totalCost.add(baseCosts);
        BigDecimal percentage = BigDecimal.valueOf(0.05);
        totalCost = totalCost.add(estimatedCarPrice.multiply(percentage));

        return totalCost;
    }
}
