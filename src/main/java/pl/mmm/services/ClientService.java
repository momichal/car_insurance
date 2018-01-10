package pl.mmm.services;

import pl.mmm.model.entities.Car;
import pl.mmm.model.entities.Client;

import java.util.List;

public interface ClientService {
    void addNewClient(Client client);

    Client getClientById(long id);

    List<Client> getAllClients();
}
