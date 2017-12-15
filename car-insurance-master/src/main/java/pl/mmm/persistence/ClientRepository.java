package pl.mmm.persistence;

import pl.mmm.model.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client,Long>{
    Client getClientById(long id);
    void saveClient(Client client);
}
