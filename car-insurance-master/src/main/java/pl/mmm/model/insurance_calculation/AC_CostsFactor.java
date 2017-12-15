package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public class AC_CostsFactor {
    private int percentageReduce;
    private BigDecimal carPrice;

    public AC_CostsFactor(int percentageReduce, BigDecimal carPrice) {
        this.percentageReduce = percentageReduce;
        this.carPrice = carPrice;
    }

    public int getPercentageReduce() {
        return percentageReduce;
    }

    public BigDecimal getCarPrice() {
        return carPrice;
    }
}
