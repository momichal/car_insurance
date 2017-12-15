package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

class InsuranceFactors {
    private final BigDecimal baseCosts;
    private final BigDecimal estimatedCarPrice;
    private final BigDecimal engineRatio;
    private final BigDecimal totalReduceRatio;
    private final BigDecimal carAgeRatio;

    InsuranceFactors(Builder builder) {
        baseCosts = builder.baseCosts;
        estimatedCarPrice = builder.estimatedCarPrice;
        engineRatio = builder.engineRatio;
        totalReduceRatio = builder.totalReduceRatio;
        carAgeRatio = builder.carAgeRatio;
    }

    public BigDecimal getBaseCosts() {
        return baseCosts;
    }

    public BigDecimal getEstimatedCarPrice() {
        return estimatedCarPrice;
    }

    public BigDecimal getEngineRatio() {
        return engineRatio;
    }

    public BigDecimal getTotalReduceRatio() {
        return totalReduceRatio;
    }

    public BigDecimal getCarAgeRatio() {
        return carAgeRatio;
    }

    public static class Builder {
        private BigDecimal baseCosts = BigDecimal.ZERO;
        private BigDecimal estimatedCarPrice = BigDecimal.ZERO;
        private BigDecimal engineRatio = BigDecimal.ZERO;
        private BigDecimal totalReduceRatio = BigDecimal.ZERO;
        private BigDecimal carAgeRatio = BigDecimal.ZERO;

        public Builder baseCosts(double value) {
            baseCosts = new BigDecimal(value);
            return this;
        }

        public Builder estimatedCarPrice(double value) {
            estimatedCarPrice = new BigDecimal(value);
            return this;
        }

        public Builder engineRatio(double value) {
            engineRatio = new BigDecimal(value);
            return this;
        }

        public Builder totalReduceRatio(double value) {
            totalReduceRatio = new BigDecimal(value);
            return this;
        }

        public Builder carAgeRatio(double value) {
            carAgeRatio = new BigDecimal(value);
            return this;
        }

        public InsuranceFactors build() {
            return new InsuranceFactors(this);
        }

    }
}
