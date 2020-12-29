package com.example.dao;

import com.example.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakePersonDataAccessService implements PersonDao {

    // list of person acts as database
    private static List<Person> DB = new ArrayList<>();

    // simply inserts a new person to the database
    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
