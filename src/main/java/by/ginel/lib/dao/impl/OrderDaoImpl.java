package by.ginel.lib.dao.impl;

import by.ginel.lib.dao.api.OrderDao;
import by.ginel.lib.dao.entity.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Slf4j
@Repository
public class OrderDaoImpl extends AbstractDao<Order> implements OrderDao {

    @Override
    protected Class<Order> getEntityClass() { return Order.class; }

    @Override
    public List<Order> findAllByStatus(OrderStatus status) {
        log.info("Executing method findAllByStatus()");
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Order> cq = cb.createQuery(Order.class);
        Root<Order> root = cq.from(Order.class);
        cq.select(root).where(cb.equal(root.get(Order_.STATUS), status.ordinal()));
        return entityManager.createQuery(cq).getResultList();
    }
}
