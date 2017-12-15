package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public class InsuranceCalcOC implements InsuranceCalc {

    @Override
    public BigDecimal calculateInsuranceCosts(InsuranceFactors factors) {
        BigDecimal baseCosts = factors.getBaseCosts();
        BigDecimal carAgeRatio = factors.getCarAgeRatio();
        BigDecimal engineRatio = factors.getEngineRatio();
        BigDecimal totalReduceRatio = factors.getTotalReduceRatio();

        BigDecimal totalCost = BigDecimal.ZERO;
        totalCost = totalCost.add(baseCosts);
        totalCost = totalCost.add(baseCosts.multiply(carAgeRatio));
        totalCost = totalCost.add(totalCost.multiply(engineRatio));
        totalCost = totalCost.subtract(totalCost.multiply(totalReduceRatio));
        return totalCost;
    }
}
