package pl.mmm.model.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table
public class Client {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private BigInteger pesel;
    @Column
    private int age;
    @Column
    private int drivingPeriodInYears;

    public Client(String name, String surname, BigInteger pesel, int age, int drivingPeriodInYears) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.age = age;
        this.drivingPeriodInYears = drivingPeriodInYears;
    }
}
