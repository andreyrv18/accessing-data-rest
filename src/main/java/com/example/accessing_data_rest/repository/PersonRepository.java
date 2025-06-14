package com.example.accessing_data_rest.repository;

import com.example.accessing_data_rest.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person, Long> {
    List<Person> findById(long id);
    List<Person> findByFirstName(String firstName);
    List<Person> findByLastName(String firstName);

}
