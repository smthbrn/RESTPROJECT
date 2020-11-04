package com.example.RESTPROJECT.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class ClientController {
//    @Autowired
//    ClientReprository clientReprository;
//
//    @GetMapping("/clients")
//    public List allGetNotes(){
//        return clientReprository.findAll();
//    }
//
////    @GetMapping("/clients/{id}")
////    Client<Client> one(@PathVariable Long id) {
////
////        Client client = clientReprository.findById(id) //
////                .orElseThrow(() -> new ClientNotFoundException(id));
////
////        return Client.of(employee, //
////                linkTo(methodOn(EmployeeController.class).one(id)).withSelfRel(),
////                linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
////    }
//
//    @PostMapping("/clients")
//    public Client createNote(@Valid @RequestBody Client clients){
//        return clientReprository.save(clients);
//    }
//
//    @GetMapping("/clients/{id}")
//    public Client getNoteById(@PathVariable(value = "id") Long clientId)  {
//        return clientReprository.findById(clientId);
//    }



}
