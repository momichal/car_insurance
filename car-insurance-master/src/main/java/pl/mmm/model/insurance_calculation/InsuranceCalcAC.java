package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public class InsuranceCalcAC implements InsuranceCalc {

    private AC_CostsFactor impact;

    public InsuranceCalcAC(AC_CostsFactor impact) {
        this.impact = impact;
    }

    @Override
    public double calculateInsuranceCosts() {
        return 0;
    }
}
