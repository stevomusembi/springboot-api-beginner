package com.example.demo.dao;

import com.example.demo.model.Person;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
    List<Person> selectAllPeople() throws SQLException;

    Optional<Person> selectPersonById(UUID id);
    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);


}
