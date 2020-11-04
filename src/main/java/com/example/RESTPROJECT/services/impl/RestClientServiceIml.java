package com.example.RESTPROJECT.services.impl;

import com.example.RESTPROJECT.entites.RestClient;
import com.example.RESTPROJECT.reprository.RestClientReprository;
import com.example.RESTPROJECT.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestClientServiceIml implements RestService {
    @Autowired
    private RestClientReprository restClientReprository;


    @Override
    public RestClient addRestClient(RestClient restClient) {
        return restClientReprository.save(restClient);
    }

    @Override
    public List <RestClient> getAllRestClients() {
        return restClientReprository.findAll();
    }

    @Override
    public RestClient getRestClient(Long id) {
        return restClientReprository.getOne(id);
    }

    @Override
    public void deleteRestClient(RestClient restClient) {
        restClientReprository.delete(restClient);
    }

    @Override
    public RestClient saveRestClient(RestClient restClient) {
        return restClientReprository.save(restClient);
    }
}
