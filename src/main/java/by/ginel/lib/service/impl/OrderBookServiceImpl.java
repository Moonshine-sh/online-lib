package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.OrderBookDao;
import by.ginel.lib.dao.entity.BookCover;
import by.ginel.lib.dao.entity.OrderBook;
import by.ginel.lib.service.api.OrderBookService;
import by.ginel.lib.service.dto.*;
import by.ginel.lib.service.mapper.OrderBookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderBookServiceImpl implements OrderBookService {

    @Autowired
    OrderBookDao orderBookDao;

    @Autowired
    OrderBookMapper orderBookMapper;

    @Transactional
    @Override
    public void save(OrderBookCreateDto orderBookCreateDto) {
        orderBookDao.save(orderBookMapper.orderBookCreateDtoToOrderBook(orderBookCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) { orderBookDao.delete(id);
    }

    @Transactional
    @Override
    public void update(OrderBookUpdateDto orderBookUpdateDto) {
        orderBookDao.update(orderBookMapper.orderBookUpdateDtoToOrderBook(orderBookUpdateDto));
    }

    @Override
    public OrderBookGetDto getById(Long id) {
        OrderBook orderBook = orderBookDao.getById(id);
        return  orderBookMapper.orderBookToOrderBookGetDto(orderBook);
    }

    @Override
    public List<OrderBookGetDto> getAll() {
        List<OrderBook> orderBooks = orderBookDao.getAll();
        return orderBooks
                .stream()
                .map(orderBook ->orderBookMapper.orderBookToOrderBookGetDto(orderBook))
                .collect(Collectors.toList());
    }
}
