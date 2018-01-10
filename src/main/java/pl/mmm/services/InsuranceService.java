package pl.mmm.services;

import org.springframework.stereotype.Service;
import pl.mmm.model.entities.Insurance;


public interface InsuranceService {
    void addInsurance(Insurance insurance);
}
