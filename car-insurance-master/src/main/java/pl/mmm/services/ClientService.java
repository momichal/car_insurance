package pl.mmm.services;

import pl.mmm.model.entities.Client;
import pl.mmm.model.entities.ClientCar;

public interface ClientService {
    void addNewClient(Client client);
    void assignCarToClient(Client client, ClientCar clientCar);
}
