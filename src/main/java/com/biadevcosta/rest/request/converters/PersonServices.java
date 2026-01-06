package com.biadevcosta.rest.request.converters;

import com.biadevcosta.rest.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding one Person!");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Ana Bia");
        person.setLastName("Costa");
        person.setAddress("São Paulo");
        person.setGender("female");
        return person;

    }

    public List<Person> findAll() {
        logger.info("Finding all People!");
        List<Person> persons = new ArrayList<Person>();

        for(int i =0; i < 8; i++ ) {
            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;
    }

    public Person create(Person person) {
        logger.info("Creating one person!");
        return person;
    }

    public Person update(Person person) {
        logger.info("Updating one person!");
        return person;
    }

    public void delete(String id) {
        logger.info("Deleting one person!");
    }



    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Person " + i);
        person.setLastName("Last name " + i);
        person.setAddress("Address " + i);
        person.setGender("female");
        return person;
    }
}
