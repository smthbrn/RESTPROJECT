package com.example.RESTPROJECT.controller;

import com.example.RESTPROJECT.entites.RestClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public RestClient restClient(@RequestParam(value = "name", defaultValue = "somename")
                                 String name,
                                 @RequestParam(value = "foundation_date_gte", defaultValue = "0")
                                 int foundation_date_gte,
                                 @RequestParam(value = "foundation_date_lte", defaultValue = "0")
                                 int foundation_date_lte,
                                 @RequestParam(value = "address ", defaultValue = "gogol")
                                 String address,
                                 @RequestParam(value = "countryCode", defaultValue = "1")
                                 String contryCode,
                                 @RequestParam(value = "cityName", defaultValue = "Almaty") String cityName) {
        return new RestClient(null, name, foundation_date_gte, foundation_date_lte,address, contryCode, cityName);
    }
}
