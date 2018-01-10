package pl.mmm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmm.model.entities.Car;
import pl.mmm.model.entities.Client;
import pl.mmm.persistence.ClientCarRepository;

@Service
public class ClientCarServiceImpl implements ClientCarService {

    private ClientCarRepository carRepository;

    @Autowired
    public ClientCarServiceImpl(ClientCarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void addNewCar(Car car) {
        carRepository.save(car);
    }

    @Override
    public void addCarToClient(Client client, Car car) {
        car.setClient(client);
        carRepository.save(car);
    }
}
