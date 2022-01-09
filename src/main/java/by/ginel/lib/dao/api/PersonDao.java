package by.ginel.lib.dao.api;

import by.ginel.lib.dao.entity.Person;

import java.util.List;

public interface PersonDao extends Dao<Person>{

    List<Person> findAllByName(String name);
    List<Person> findAllLocked();
    List<Person> findByLogin(String login);
}
