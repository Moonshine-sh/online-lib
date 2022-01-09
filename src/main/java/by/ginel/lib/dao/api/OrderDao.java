package by.ginel.lib.dao.api;

import by.ginel.lib.dao.entity.Order;
import by.ginel.lib.dao.entity.OrderStatus;

import java.util.List;

public interface OrderDao extends Dao<Order> {

    List<Order> findAllByStatus(OrderStatus status);
}
