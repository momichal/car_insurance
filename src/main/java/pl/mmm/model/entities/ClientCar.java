package pl.mmm.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
public class ClientCar {
    @Id
    private long id;
    private int engineCm3;
    private int productionYear;
    private BigDecimal estimatedPrice;

    public ClientCar(int engineCm3, int productionYear, BigDecimal estimatedPrice) {
        this.engineCm3 = engineCm3;
        this.productionYear = productionYear;
        this.estimatedPrice = estimatedPrice;
    }

    public int getEngineCm3() {
        return engineCm3;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public BigDecimal getEstimatedPrice() {
        return estimatedPrice;
    }
}
