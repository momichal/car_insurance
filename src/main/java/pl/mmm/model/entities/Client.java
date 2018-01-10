package pl.mmm.model.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "pesel")
    private BigInteger pesel;

    @Column(name = "age")
    private int age;

    @Column(name = "driving_period")
    private int drivingPeriodInYears;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Car> cars;

    public Client() {
    }

    public Client(String name, String surname, BigInteger pesel, int age, int drivingPeriodInYears) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.age = age;
        this.drivingPeriodInYears = drivingPeriodInYears;
        cars = new ArrayList<>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigInteger getPesel() {
        return pesel;
    }

    public void setPesel(BigInteger pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingPeriodInYears() {
        return drivingPeriodInYears;
    }

    public void setDrivingPeriodInYears(int drivingPeriodInYears) {
        this.drivingPeriodInYears = drivingPeriodInYears;
    }
}
