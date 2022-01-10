package by.ginel.lib.service.impl;

import by.ginel.lib.dao.api.OrderDao;
import by.ginel.lib.dao.entity.Order;
import by.ginel.lib.dao.entity.OrderBook;
import by.ginel.lib.dao.entity.OrderStatus;
import by.ginel.lib.service.api.OrderService;
import by.ginel.lib.service.dto.OrderCreateDto;
import by.ginel.lib.service.dto.OrderGetDto;
import by.ginel.lib.service.dto.OrderUpdateDto;
import by.ginel.lib.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderMapper orderMapper;

    @Transactional
    @Override
    public void save(OrderCreateDto orderCreateDto) {
        orderDao.save(orderMapper.orderCreateDtoToOrder(orderCreateDto));
    }

    @Transactional
    @Override
    public void delete(Long id) { orderDao.delete(id);
    }

    @Transactional
    @Override
    public void update(OrderUpdateDto orderUpdateDto) {
        orderDao.update(orderMapper.orderUpdateDtoToOrder(orderUpdateDto));
    }

    @Override
    public OrderGetDto getById(Long id) {
        Order order = orderDao.getById(id);
        return  orderMapper.orderToOrderGetDto(order);
    }

    @Override
    public List<OrderGetDto> getAll() {
        List<Order> orders = orderDao.getAll();
        return orders
                .stream()
                .map(order ->orderMapper.orderToOrderGetDto(order))
                .collect(Collectors.toList());
    }

    @Override
    public List<OrderGetDto> findAllByStatus(OrderStatus status) {
        List<Order> orders = orderDao.findAllByStatus(status);
        return orders
                .stream()
                .map(order ->orderMapper.orderToOrderGetDto(order))
                .collect(Collectors.toList());
    }
}
