package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.BookQuantityDao;
import by.ginel.lib.dao.entity.BookQuantity;
import org.springframework.stereotype.Repository;

@Repository
public class BookQuantityDaoImpl extends AbstractDao<BookQuantity> implements BookQuantityDao {
    @Override
    protected Class<BookQuantity> getEntityClass() { return BookQuantity.class; }
}
