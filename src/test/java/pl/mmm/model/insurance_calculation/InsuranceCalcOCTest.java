package pl.mmm.model.insurance_calculation;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class InsuranceCalcOCTest {

    private InsuranceCalc calc = new InsuranceCalcOC();
    private double baseCosts = 1000.0;


    @Test
    public void testDefaultFactors() throws Exception {
        InsuranceFactors factors = new InsuranceFactors.Builder().build();
        BigDecimal result = calc.calculateInsuranceCosts(factors);
        assertEquals(BigDecimal.ZERO, result);
    }

    @Test
    public void calculateBaseOC() throws Exception {
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .baseCosts(baseCosts)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);
        assertEquals(baseCosts, result.doubleValue(), 0.01);
    }

    @Test
    public void calculateWithEngineRatio() throws Exception {
        double engineRatio = 0.25;
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .baseCosts(baseCosts)
                .engineRatio(0.25)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);
        double expected = baseCosts + baseCosts * engineRatio;
        assertEquals(expected, result.doubleValue(), 0.01);
    }

    @Test
    public void calculateWithCarAgeRatio() throws Exception {
        double carAgeRatio = 0.25;
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .baseCosts(baseCosts)
                .carAgeRatio(carAgeRatio)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);
        double expected = baseCosts + baseCosts * carAgeRatio;
        assertEquals(expected, result.doubleValue(), 0.01);
    }

    @Test
    public void calculateWithTotalReduceRatio() throws Exception {
        double totalReduceRatio = 0.25;
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .baseCosts(baseCosts)
                .totalReduceRatio(totalReduceRatio)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);
        double expected = baseCosts - baseCosts * totalReduceRatio;
        assertEquals(expected, result.doubleValue(), 0.01);
    }

    @Test
    public void calculateAllFactors() throws Exception {
        double engineRatio = 0.1;
        double carAgeRatio = 0.2;
        double totalReduceRatio = 0.3;
        InsuranceFactors factors = new InsuranceFactors.Builder()
                .baseCosts(baseCosts)
                .engineRatio(engineRatio)
                .carAgeRatio(carAgeRatio)
                .totalReduceRatio(totalReduceRatio)
                .build();

        BigDecimal result = calc.calculateInsuranceCosts(factors);
        double expectedTotal = baseCosts;
        expectedTotal += baseCosts * carAgeRatio;
        expectedTotal += expectedTotal * engineRatio;
        expectedTotal -= expectedTotal * totalReduceRatio;
        assertEquals(expectedTotal, result.doubleValue(), 0.01);
    }

}