package pl.mmm.services;

import pl.mmm.model.entities.Payment;

public interface PaymentService {
    void settlePayment(Payment payment);
}
