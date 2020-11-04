package com.example.RESTPROJECT.services;

import com.example.RESTPROJECT.entites.Clients;

import java.util.List;

public interface ClientService {
    Clients addClient(Clients client);
    List <Clients> getAllClients();
    Clients getClient(Long id);
    void deleteClient(Clients client);
    Clients saveClient(Clients client);
}
