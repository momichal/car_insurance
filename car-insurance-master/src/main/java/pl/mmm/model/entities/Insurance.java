package pl.mmm.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
public class Insurance {
    @Id
    private long id;
    Client client;
    ClientCar clientCar;
    Payment payment;
    private LocalDate insuranceBeginDate;
    private LocalDate insuranceEndDate;

    public Insurance(Client client, ClientCar clientCar, Payment payment, LocalDate insuranceBeginDate, LocalDate insuranceEndDate) {
        this.client = client;
        this.clientCar = clientCar;
        this.payment = payment;
        this.insuranceBeginDate = insuranceBeginDate;
        this.insuranceEndDate = insuranceEndDate;
    }
}
