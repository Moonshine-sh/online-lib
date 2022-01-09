package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.BookDao;
import by.ginel.lib.dao.entity.Book;
import by.ginel.lib.dao.entity.Book_;
import by.ginel.lib.dao.entity.Genre;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Slf4j
@Repository
public class BookDaoImpl extends AbstractDao<Book> implements BookDao {

    @Override
    protected Class<Book> getEntityClass() { return Book.class; }

    @Override
    public List<Book> findAllByName(String name) {
        log.info("Executing method findAllByName()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root).where(cb.equal(root.get(Book_.NAME), name));
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public List<Book> findAllByAuthor(String author) {
        log.info("Executing method findAllByAuthor()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root).where(cb.equal(root.get(Book_.AUTHOR), author));
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public List<Book> findAllByGenre(Genre genre) {
        log.info("Executing method findAllByGenre()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Book> cq = cb.createQuery(Book.class);
        Root<Book> root = cq.from(Book.class);
        cq.select(root).where(cb.equal(root.get(Book_.GENRE), genre.ordinal()));
        return entityManager.createQuery(cq).getResultList();
    }
}
