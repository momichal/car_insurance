package pl.mmm.model.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Payment {
    @Id
    private long id;
    private LocalDate paymentDate;
    private double bill;
    private boolean isPaid;

    public Payment(LocalDate paymentDate, double bill, boolean isPaid) {
        this.paymentDate = paymentDate;
        this.bill = bill;
        this.isPaid = isPaid;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public double getBill() {
        return bill;
    }

    public boolean isPaid() {
        return isPaid;
    }
}
