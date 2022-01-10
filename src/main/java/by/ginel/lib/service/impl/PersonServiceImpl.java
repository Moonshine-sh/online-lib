package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.BookDao;
import by.ginel.lib.dao.api.PersonDao;
import by.ginel.lib.dao.entity.Book;
import by.ginel.lib.dao.entity.Person;
import by.ginel.lib.service.api.PersonService;
import by.ginel.lib.service.dto.*;
import by.ginel.lib.service.mapper.BookMapper;
import by.ginel.lib.service.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    @Autowired
    PersonMapper personMapper;

    @Transactional
    @Override
    public void save(PersonCreateDto personCreateDto) {
        personDao.save(personMapper.personCreateDtoToPerson(personCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) { personDao.delete(id);
    }

    @Transactional
    @Override
    public void update(PersonUpdateDto personUpdateDto) {
        personDao.update(personMapper.personUpdateDtoToPerson(personUpdateDto));
    }

    @Override
    public PersonGetDto getById(Long id) {
        Person person = personDao.getById(id);
        return  personMapper.personToPersonGetDto(person);
    }

    @Override
    public List<PersonGetDto> getAll() {
        List<Person> people = personDao.getAll();
        return people
                .stream()
                .map(person ->personMapper.personToPersonGetDto(person))
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonGetDto> findAllByName(String name) {
        List<Person> people = personDao.findAllByName(name);
        return people
                .stream()
                .map(person ->personMapper.personToPersonGetDto(person))
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonGetDto> findAllLocked() {
        List<Person> people = personDao.findAllLocked();
        return people
                .stream()
                .map(person ->personMapper.personToPersonGetDto(person))
                .collect(Collectors.toList());
    }

    @Override
    public List<PersonGetDto> findByLogin(String login) {
        List<Person> people = personDao.findByLogin(login);
        return people
                .stream()
                .map(person ->personMapper.personToPersonGetDto(person))
                .collect(Collectors.toList());
    }
}
