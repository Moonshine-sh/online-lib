package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.PersonDao;
import by.ginel.lib.dao.entity.Person;
import by.ginel.lib.dao.entity.Person_;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Slf4j
@Repository
public class PersonDaoImpl extends AbstractDao<Person> implements PersonDao {

    @Override
    protected Class<Person> getEntityClass() { return Person.class; }

    @Override
    public List<Person> findAllByName(String name) {
        log.info("Executing method findAllByName()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> cq = cb.createQuery(Person.class);
        Root<Person> root = cq.from(Person.class);
        cq.select(root).where(
                cb.or(
                        cb.equal(root.get(Person_.FIRST_NAME), name),
                        cb.equal(root.get(Person_.LAST_NAME), name)
                )
        );
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public List<Person> findAllLocked() {
        log.info("Executing method findAllLocked()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> cq = cb.createQuery(Person.class);
        Root<Person> root = cq.from(Person.class);
        cq.select(root).where(cb.equal(root.get(Person_.LOCKED), true));
        return entityManager.createQuery(cq).getResultList();
    }

    @Override
    public List<Person> findByLogin(String login) {
        log.info("Executing method findAllByLogin()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Person> cq = cb.createQuery(Person.class);
        Root<Person> root = cq.from(Person.class);
        cq.select(root).where(cb.equal(root.get(Person_.LOGIN), login));
        return entityManager.createQuery(cq).getResultList();
    }
}
