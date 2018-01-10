package pl.mmm.model.insurance_calculation;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class InsuranceCalcACTest {
    private InsuranceCalc calc = new InsuranceCalcAC();
    private double estimatedCarPrice = 1000.0;
    private double percentage = 5.0;

    @Test
    public void calculatePercentCosts() throws Exception {
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .estimatedCarPrice(estimatedCarPrice)
                .percentage(percentage)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);

        assertEquals(percentage * 0.01 * estimatedCarPrice, result.doubleValue(), 0.01);
    }


    @Test
    public void calculateACCosts() throws Exception {
        double baseCost = 500.0;
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .baseCosts(baseCost)
                .estimatedCarPrice(estimatedCarPrice)
                .percentage(percentage)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);
        assertEquals(baseCost + (percentage * 0.01 * estimatedCarPrice), result.doubleValue(), 0.01);
    }


}



