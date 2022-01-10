package by.ginel.lib.service.api;

import by.ginel.lib.service.dto.AbstractCreateDto;
import by.ginel.lib.service.dto.AbstractGetDto;
import by.ginel.lib.service.dto.AbstractUpdateDto;

import java.util.List;

public interface Service <C extends AbstractCreateDto, U extends AbstractUpdateDto, G extends AbstractGetDto> {
    void save(C createDto);
    void delete(Long id);
    void update(U updateDto);
    G getById(Long id);
    List<G> getAll();
}
