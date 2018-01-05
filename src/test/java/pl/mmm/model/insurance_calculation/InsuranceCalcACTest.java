package pl.mmm.model.insurance_calculation;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class InsuranceCalcACTest {
    private double estimatedCarPrice = 1000.0;
    private double baseCost = 500;
    private double percentage = 0.05;
    private InsuranceCalc calc = new InsuranceCalcAC();

    @Test
    public void calculatePercentCosts() throws Exception {
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .estimatedCarPrice(estimatedCarPrice)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);

        assertEquals(percentage * estimatedCarPrice, result.doubleValue(), 0.01);
    }


    @Test
    public void calculateACCosts() throws Exception {
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .estimatedCarPrice(estimatedCarPrice)
                .baseCosts(baseCost)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);

        assertEquals(baseCost+ (percentage* estimatedCarPrice), result.doubleValue(), 0.01);
    }


    }



