package by.ginel.lib.service.mapper;

import by.ginel.lib.dao.entity.Book;
import by.ginel.lib.service.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

    Book bookCreateDtoToBook(BookCreateDto bookCreateDto);
    Book bookUpdateDtoToBook(BookUpdateDto bookUpdateDto);
    BookGetDto bookToBookGetDto(Book book);
}
