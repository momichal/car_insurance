package pl.mmm.services;

import pl.mmm.model.entities.Client;
import pl.mmm.model.entities.ClientCar;
import pl.mmm.persistence.ClientRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

//    private ClientCarRepository clientCarRepository;

//    public ClientServiceImpl(ClientRepository clientRepository, ClientCarRepository clientCarRepository) {
//        this.clientRepository = clientRepository;
//        this.clientCarRepository = clientCarRepository;
//    }

    @Override
    public void addNewClient(Client client) {

    }

    @Override
    public void assignCarToClient(Client client, ClientCar clientCar) {

    }
}
