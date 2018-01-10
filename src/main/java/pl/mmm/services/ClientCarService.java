package pl.mmm.services;

import pl.mmm.model.entities.Car;
import pl.mmm.model.entities.Client;

public interface ClientCarService {
    void addNewCar(Car car);
    void addCarToClient(Client client, Car car);
}
