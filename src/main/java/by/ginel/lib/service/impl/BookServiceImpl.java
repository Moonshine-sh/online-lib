package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.BookDao;
import by.ginel.lib.dao.entity.Book;
import by.ginel.lib.dao.entity.Genre;
import by.ginel.lib.service.api.BookService;
import by.ginel.lib.service.dto.*;
import by.ginel.lib.service.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookDao bookDao;

    @Autowired
    BookMapper bookMapper;

    @Transactional
    @Override
    public void save(BookCreateDto bookCreateDto) {
        bookDao.save(bookMapper.bookCreateDtoToBook(bookCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) { bookDao.delete(id);
    }

    @Transactional
    @Override
    public void update(BookUpdateDto bookUpdateDto) {
        bookDao.update(bookMapper.bookUpdateDtoToBook(bookUpdateDto));
    }

    @Override
    public BookGetDto getById(Long id) {
        Book book = bookDao.getById(id);
        return  bookMapper.bookToBookGetDto(book);
    }

    @Override
    public List<BookGetDto> getAll() {
        List<Book> books = bookDao.getAll();
        return books
                .stream()
                .map(book ->bookMapper.bookToBookGetDto(book))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookGetDto> findAllByName(String name) {
        List<Book> books = bookDao.findAllByName(name);
        return books
                .stream()
                .map(book ->bookMapper.bookToBookGetDto(book))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookGetDto> findAllByAuthor(String author) {
        List<Book> books = bookDao.findAllByAuthor(author);
        return books
                .stream()
                .map(book ->bookMapper.bookToBookGetDto(book))
                .collect(Collectors.toList());
    }

    @Override
    public List<BookGetDto> findAllByGenre(Genre genre) {
        List<Book> books = bookDao.findAllByGenre(genre);
        return books
                .stream()
                .map(book ->bookMapper.bookToBookGetDto(book))
                .collect(Collectors.toList());
    }
}
