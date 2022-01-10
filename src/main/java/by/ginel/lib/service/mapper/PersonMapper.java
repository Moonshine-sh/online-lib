package by.ginel.lib.service.mapper;

import by.ginel.lib.dao.entity.Person;
import by.ginel.lib.service.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    Person personCreateDtoToPerson(PersonCreateDto personCreateDto);
    Person personUpdateDtoToPerson(PersonUpdateDto personUpdateDto);
    PersonGetDto personToPersonGetDto(Person person);
}
