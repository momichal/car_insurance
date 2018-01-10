package pl.mmm.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private int engineCm3;

    @Column
    private int productionYear;
    @Column

    private BigDecimal estimatedPrice;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Client.class)
    @JoinColumn(name = "client_id")
    @JsonIgnore
    private Client client;

    public Car() {
    }

    public Car(int engineCm3, int productionYear, BigDecimal estimatedPrice) {
        this.engineCm3 = engineCm3;
        this.productionYear = productionYear;
        this.estimatedPrice = estimatedPrice;
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

    public int getEngineCm3() {
        return engineCm3;
    }

    public void setEngineCm3(int engineCm3) {
        this.engineCm3 = engineCm3;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(BigDecimal estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }
}
