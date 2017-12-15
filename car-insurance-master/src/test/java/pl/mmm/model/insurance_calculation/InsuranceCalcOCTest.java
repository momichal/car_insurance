package pl.mmm.model.insurance_calculation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsuranceCalcOCTest {

    @Test
    public void calculateInsuranceCosts() throws Exception {
        int percentageReduce = 0;
        int carAge = 0;
        int engineCapacity = 0;
        int basePrice = 1000;

        OC_CostsFactor factor = new OC_CostsFactor(percentageReduce, carAge, engineCapacity, basePrice);

        InsuranceCalcOC insuranceOC = new InsuranceCalcOC(factor);
        double insuranceCosts = insuranceOC.calculateInsuranceCosts();
        assertEquals(basePrice, insuranceCosts, 0.01);
    }

    @Test
    public void calculateEngineCapacity() throws Exception {
        int percentageReduce = 0;
        int carAge = 0;
        int engineCapacity = 2500;
        int basePrice = 1000;

        OC_CostsFactor factor = new OC_CostsFactor(percentageReduce, carAge, engineCapacity, basePrice);
        InsuranceCalcOC insuranceOC = new InsuranceCalcOC(factor);
        double insuranceCosts = insuranceOC.calculateInsuranceCosts();
        assertEquals(1250, insuranceCosts, 0.01);
    }

    @Test
    public void calculateCarAge() throws Exception {
        int percentageReduce = 0;
        int carAge = 10;
        int engineCapacity = 0;
        int basePrice = 1000;

        OC_CostsFactor factor = new OC_CostsFactor(percentageReduce, carAge, engineCapacity, basePrice);
        InsuranceCalcOC insuranceOC = new InsuranceCalcOC(factor);
        double insuranceCosts = insuranceOC.calculateInsuranceCosts();
        assertEquals(1100, insuranceCosts, 0.01);
    }

    @Test
    public void calculatePercentageReduce() throws Exception {
        int percentageReduce = 20;
        int carAge = 0;
        int engineCapacity = 0;
        int basePrice = 1000;

        OC_CostsFactor factor = new OC_CostsFactor(percentageReduce, carAge, engineCapacity, basePrice);
        InsuranceCalcOC insuranceOC = new InsuranceCalcOC(factor);
        double insuranceCosts = insuranceOC.calculateInsuranceCosts();
        assertEquals(800, insuranceCosts, 0.01);
    }

    @Test
    public void calculateAll() throws Exception {
        int percentageReduce = 20;
        int carAge = 25;
        int engineCapacity = 3500;
        int basePrice = 1000;

        OC_CostsFactor factor = new OC_CostsFactor(percentageReduce, carAge, engineCapacity, basePrice);
        InsuranceCalcOC insuranceOC = new InsuranceCalcOC(factor);
        double insuranceCosts = insuranceOC.calculateInsuranceCosts();
        assertEquals(1350, insuranceCosts, 0.01);
    }

}