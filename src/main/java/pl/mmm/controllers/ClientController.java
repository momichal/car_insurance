package pl.mmm.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mmm.model.entities.Car;
import pl.mmm.model.entities.Client;
import pl.mmm.services.ClientCarService;
import pl.mmm.services.ClientService;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping(value = "client")
public class ClientController {

    private ClientService clientService;
    private ClientCarService carService;


    public ClientController() {
    }

    @Autowired
    public ClientController(ClientService clientService, ClientCarService carService) {
        this.clientService = clientService;
        this.carService = carService;
    }

    //TODO delete later
    @RequestMapping("addclient")
    public Client test() {
        Client client = new Client("Andrzej", "Duda", BigInteger.ZERO, 21, 37);
        clientService.addNewClient(client);
        return client;
    }

    //TODO delete later
    @RequestMapping("addcar/{clientId}")
    public Car test(@PathVariable("clientId") long id) {
        Client client = clientService.getClientById(id);
        Car car = new Car(2137, 2005, BigDecimal.ZERO);
        carService.addCarToClient(client, car);
        return car;
    }


    @RequestMapping("{id}")
    public Client getClientById(@PathVariable("id") long id) {
        return clientService.getClientById(id);
    }

    @RequestMapping("all")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

}
