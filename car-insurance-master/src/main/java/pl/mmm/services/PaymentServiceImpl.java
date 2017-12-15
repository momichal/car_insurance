package pl.mmm.services;

import pl.mmm.model.entities.Payment;
import pl.mmm.persistence.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void settlePayment(Payment payment) {

    }
}
