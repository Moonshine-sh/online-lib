package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.BookQuantityDao;
import by.ginel.lib.dao.entity.BookQuantity;
import by.ginel.lib.service.api.BookQuantityService;
import by.ginel.lib.service.dto.*;
import by.ginel.lib.service.mapper.BookQuantityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookQuantityServiceImpl implements BookQuantityService {

    @Autowired
    BookQuantityDao bookQuantityDao;

    @Autowired
    BookQuantityMapper bookQuantityMapper;

    @Transactional
    @Override
    public void save(BookQuantityCreateDto bookQuantityCreateDto) {
        bookQuantityDao.save(bookQuantityMapper.bookQuantityCreateDtoToBookQuantity(bookQuantityCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) {
        bookQuantityDao.delete(id);
    }

    @Transactional
    @Override
    public void update(BookQuantityUpdateDto bookQuantityUpdateDto) {
        bookQuantityDao.update(bookQuantityMapper.bookQuantityUpdateDtoToBookQuantity(bookQuantityUpdateDto));
    }

    @Override
    public BookQuantityGetDto getById(Long id) {
        BookQuantity bookQuantity = bookQuantityDao.getById(id);
        return  bookQuantityMapper.bookQuantityToBookQuantityGetDto(bookQuantity);
    }

    @Override
    public List<BookQuantityGetDto> getAll() {
        List<BookQuantity> bookQuantities = bookQuantityDao.getAll();
        return bookQuantities
                .stream()
                .map(bookQuantity ->bookQuantityMapper.bookQuantityToBookQuantityGetDto(bookQuantity))
                .collect(Collectors.toList());
    }
}
