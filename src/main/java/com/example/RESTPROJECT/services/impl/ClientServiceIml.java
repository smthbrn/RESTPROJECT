package com.example.RESTPROJECT.services.impl;

import com.example.RESTPROJECT.entites.Clients;
import com.example.RESTPROJECT.reprository.ClientReprository;
import com.example.RESTPROJECT.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceIml implements ClientService {
    @Autowired
    private ClientReprository clientReprository;

    @Override
    public Clients addClient(Clients client) {
        return clientReprository.save(client);
    }

    @Override
    public List <Clients> getAllClients() {
        return clientReprository.findAll();
    }

    @Override
    public Clients getClient(Long id) {
        return clientReprository.getOne(id);
    }

    @Override
    public void deleteClient(Clients client) {
        clientReprository.delete(client);
    }

    @Override
    public Clients saveClient(Clients client) {
        return clientReprository.save(client);
    }
}
