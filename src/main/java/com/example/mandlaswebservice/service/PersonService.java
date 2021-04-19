package com.example.mandlaswebservice.service;

import com.example.mandlaswebservice.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    public static List<Person> personList = new ArrayList<>();

    public void savePerson(Person person)
    {
        personList.add(person);
    }

    public List<Person> getPersons()
    {
        return personList;
    }

    public Person findPersonById(int id)
    {
        for (Person person: personList) {
            if(person.getId() == id)
            {
                return person;
            }
        }
        return null;
    }
}
