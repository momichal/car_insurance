package pl.mmm.persistence;

import pl.mmm.model.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
    void addNewPayment(Payment payment);
    Payment getPaymentById(long id);
}
