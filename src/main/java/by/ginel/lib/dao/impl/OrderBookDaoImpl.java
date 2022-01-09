package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.OrderBookDao;
import by.ginel.lib.dao.entity.OrderBook;
import org.springframework.stereotype.Repository;

@Repository
public class OrderBookDaoImpl extends AbstractDao<OrderBook> implements OrderBookDao {
    @Override
    protected Class<OrderBook> getEntityClass() { return OrderBook.class; }
}