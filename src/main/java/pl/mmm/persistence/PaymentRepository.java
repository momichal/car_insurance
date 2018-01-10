package pl.mmm.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mmm.model.entities.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
    void findPaymentById(long id);
}
