package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.BookCoverDao;
import by.ginel.lib.dao.entity.BookCover;
import org.springframework.stereotype.Repository;

@Repository
public class BookCoverDaoImpl extends AbstractDao<BookCover> implements BookCoverDao {
    @Override
    protected Class<BookCover> getEntityClass() { return BookCover.class; }
}
