package pl.mmm.services;

import org.springframework.stereotype.Service;
import pl.mmm.model.entities.Payment;

public interface PaymentService {
    void settlePayment(Payment payment);
}
