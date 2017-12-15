package pl.mmm.model.insurance_calculation;

import java.math.BigDecimal;

public interface InsuranceCalc {
    BigDecimal calculateInsuranceCosts(InsuranceFactors factors);
}
