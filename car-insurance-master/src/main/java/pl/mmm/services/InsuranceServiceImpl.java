package pl.mmm.services;

import pl.mmm.model.entities.Insurance;
import pl.mmm.persistence.InsuranceRepository;
import org.springframework.stereotype.Service;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    private InsuranceRepository insuranceRepository;

    public InsuranceServiceImpl(InsuranceRepository insuranceRepository) {
        this.insuranceRepository = insuranceRepository;
    }

    @Override
    public void addInsurance(Insurance insurance) {

    }
}
