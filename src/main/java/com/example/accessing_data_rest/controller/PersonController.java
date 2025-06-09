package com.example.accessing_data_rest.controller;

import com.example.accessing_data_rest.model.Person;
import com.example.accessing_data_rest.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin; // ADICIONE ESTE IMPORT

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/people")
    public ResponseEntity<List<Person>> getPeople(){
        return  ResponseEntity.ok(personService.getPeople());
    }

    @PostMapping("/people")
    public ResponseEntity<Person> setPeople(@RequestBody Person person){
        Person perssoaSalva = personService.salvarPerssoa(person);
        return ResponseEntity.status(201).body(perssoaSalva);
    }
}
