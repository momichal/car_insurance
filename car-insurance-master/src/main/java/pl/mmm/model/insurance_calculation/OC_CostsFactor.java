package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public class OC_CostsFactor {
    private int percentageReduce; //zniżka
    private int carAge;
    private int engineCapacity;
    private double basePrice;

    public OC_CostsFactor(int percentageReduce, int carAge, int engineCapacity, double basePrice) {
        this.percentageReduce = percentageReduce;
        this.carAge = carAge;
        this.engineCapacity = engineCapacity;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getPercentageReduce() {
        return percentageReduce;
    }

    public int getCarAge() {
        return carAge;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }
}
