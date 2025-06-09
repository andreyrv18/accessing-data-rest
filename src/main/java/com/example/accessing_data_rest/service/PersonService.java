package com.example.accessing_data_rest.service;

import com.example.accessing_data_rest.model.Person;
import com.example.accessing_data_rest.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getPeople(){
        return (List<Person>) personRepository.findAll();

    }

    public Person salvarPerssoa (Person person  ){
        System.out.println(person);
        return (Person) personRepository.save(person);
    }
}
