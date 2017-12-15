package pl.mmm.persistence;

import pl.mmm.model.entities.ClientCar;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface ClientCarRepository extends CrudRepository<ClientCar,Long> {
    List<ClientCar> getClientCarById(long clientId);
    void addClientCar(long clientId, ClientCar car);
}
