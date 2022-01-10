package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.BookCoverDao;
import by.ginel.lib.dao.entity.BookCover;
import by.ginel.lib.service.api.BookCoverService;
import by.ginel.lib.service.dto.*;
import by.ginel.lib.service.mapper.BookCoverMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookCoverServiceImpl implements BookCoverService {

    @Autowired
    BookCoverDao bookCoverDao;

    @Autowired
    BookCoverMapper bookCoverMapper;

    @Transactional
    @Override
    public void save(BookCoverCreateDto bookCoverCreateDto) {
        bookCoverDao.save(bookCoverMapper.bookCoverCreateDtoToBookCover(bookCoverCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) {
        bookCoverDao.delete(id);
    }

    @Transactional
    @Override
    public void update(BookCoverUpdateDto bookCoverUpdateDto) {
        bookCoverDao.update(bookCoverMapper.bookCoverUpdateDtoToBookCover(bookCoverUpdateDto));
    }

    @Override
    public BookCoverGetDto getById(Long id) {
        BookCover bookCover = bookCoverDao.getById(id);
        return  bookCoverMapper.bookCoverToBookCoverGetDto(bookCover);
    }

    @Override
    public List<BookCoverGetDto> getAll() {
        List<BookCover> bookCovers = bookCoverDao.getAll();
        return bookCovers
                .stream()
                .map(bookCover ->bookCoverMapper.bookCoverToBookCoverGetDto(bookCover))
                .collect(Collectors.toList());
    }
}
