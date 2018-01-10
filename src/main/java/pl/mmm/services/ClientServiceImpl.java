package pl.mmm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mmm.model.entities.Car;
import pl.mmm.model.entities.Client;
import pl.mmm.persistence.ClientCarRepository;
import pl.mmm.persistence.ClientRepository;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }



    @Override
    public void addNewClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public Client getClientById(long id) {
        return clientRepository.findClientById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }


}
