package by.ginel.lib.service.api;

import by.ginel.lib.service.dto.PersonCreateDto;
import by.ginel.lib.service.dto.PersonGetDto;
import by.ginel.lib.service.dto.PersonUpdateDto;

import java.util.List;

public interface PersonService extends Service<PersonCreateDto, PersonUpdateDto, PersonGetDto>{

    List<PersonGetDto> findAllByName(String name);
    List<PersonGetDto> findAllLocked();
    List<PersonGetDto> findByLogin(String login);
}
