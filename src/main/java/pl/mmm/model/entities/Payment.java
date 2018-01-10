package pl.mmm.model.entities;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private LocalDate paymentDate;

    @Column
    private BigDecimal bill;

    @Column
    private boolean isPaid;

    public Payment() {
    }

    public Payment(LocalDate paymentDate, BigDecimal bill, boolean isPaid) {
        this.paymentDate = paymentDate;
        this.bill = bill;
        this.isPaid = isPaid;
    }

    public long getId() {
        return id;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {

        this.paymentDate = paymentDate;
    }

    public BigDecimal getBill() {
        return bill;
    }

    public void setBill(BigDecimal bill) {
        this.bill = bill;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }
}
