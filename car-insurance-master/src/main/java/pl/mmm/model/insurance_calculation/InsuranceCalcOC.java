package pl.mmm.model.insurance_calculation;

public class InsuranceCalcOC implements InsuranceCalc {

    private OC_CostsFactor costsFactor;

    public InsuranceCalcOC(OC_CostsFactor costsFactor) {
        this.costsFactor = costsFactor;
    }

    @Override
    public double calculateInsuranceCosts() {
        double totalCost = 0;
        totalCost = costsFactor.getBasePrice();
        totalCost += costsFactor.getBasePrice() * getPercentAge();
        totalCost += getEngineRatio() * totalCost;
        totalCost = totalCost - totalCost * getPercentageReduce();

        return totalCost;
    }

    private double getEngineRatio() {
        return costsFactor.getEngineCapacity() / 10000.0;
    }

    private double getPercentAge() {
        return costsFactor.getCarAge() / 100.0;
    }

    private double getPercentageReduce() {
        return costsFactor.getPercentageReduce() / 100.0;
    }
}
