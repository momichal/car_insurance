package pl.mmm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmm.model.entities.Payment;
import pl.mmm.persistence.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService {


    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void settlePayment(Payment payment) {

//        paymentRepository.saveNewPayment(payment);
    }
}
