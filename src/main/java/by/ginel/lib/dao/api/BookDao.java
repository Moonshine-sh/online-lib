package by.ginel.lib.dao.api;

import by.ginel.lib.dao.entity.Book;
import by.ginel.lib.dao.entity.Genre;

import java.util.List;

public interface BookDao extends Dao<Book>{

    List<Book> findAllByName(String name);
    List<Book> findAllByAuthor(String author);
    List<Book> findAllByGenre(Genre genre);
}
