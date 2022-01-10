package by.ginel.lib.service.api;


import by.ginel.lib.dao.entity.Genre;
import by.ginel.lib.service.dto.BookCreateDto;
import by.ginel.lib.service.dto.BookGetDto;
import by.ginel.lib.service.dto.BookUpdateDto;

import java.util.List;

public interface BookService extends Service<BookCreateDto, BookUpdateDto, BookGetDto>{

    List<BookGetDto> findAllByName(String name);
    List<BookGetDto> findAllByAuthor(String author);
    List<BookGetDto> findAllByGenre(Genre genre);
}
