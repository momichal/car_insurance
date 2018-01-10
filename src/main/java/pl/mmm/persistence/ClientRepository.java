package pl.mmm.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mmm.model.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientById(long id);
}
