package pl.mmm.model.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToOne
    private Client client;
    @OneToOne
    private Car car;
    @OneToOne
    private Payment payment;
    @Column
    private LocalDate insuranceBeginDate;
    @Column
    private LocalDate insuranceEndDate;

    public Insurance() {
    }

    public Insurance(Client client, Car car, Payment payment, LocalDate insuranceBeginDate, LocalDate insuranceEndDate) {
        this.client = client;
        this.car = car;
        this.payment = payment;
        this.insuranceBeginDate = insuranceBeginDate;
        this.insuranceEndDate = insuranceEndDate;
    }

    public long getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public LocalDate getInsuranceBeginDate() {
        return insuranceBeginDate;
    }

    public void setInsuranceBeginDate(LocalDate insuranceBeginDate) {
        this.insuranceBeginDate = insuranceBeginDate;
    }

    public LocalDate getInsuranceEndDate() {
        return insuranceEndDate;
    }

    public void setInsuranceEndDate(LocalDate insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
    }
}
