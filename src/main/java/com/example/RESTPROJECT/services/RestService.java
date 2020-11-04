package com.example.RESTPROJECT.services;

import com.example.RESTPROJECT.entites.Clients;
import com.example.RESTPROJECT.entites.RestClient;

import java.util.List;

public interface RestService {
    RestClient addRestClient(RestClient restClient);
    List <RestClient> getAllRestClients();
    RestClient getRestClient(Long id);
    void deleteRestClient(RestClient client);
    RestClient saveRestClient(RestClient client);
}
