package com.example.mandlaswebservice.controller;

import com.example.mandlaswebservice.model.Person;
import com.example.mandlaswebservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping(path = "/persons")
    public void createPerson(@RequestBody Person person)
    {
        // this method will receive a json body of type person
        personService.savePerson(person);

    }

    @GetMapping(path = "/persons")
    public List<Person> getPersons()
    {
        return personService.getPersons();
    }

    @GetMapping(path = "/persons/{id}")
    public Person getPersonById(@PathVariable int id)
    {
        Person foundPerson = personService.findPersonById(id);
        return foundPerson;
    }
}
