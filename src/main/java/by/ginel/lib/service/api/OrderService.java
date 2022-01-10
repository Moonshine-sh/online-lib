package by.ginel.lib.service.api;

import by.ginel.lib.dao.entity.OrderStatus;
import by.ginel.lib.service.dto.OrderCreateDto;
import by.ginel.lib.service.dto.OrderGetDto;
import by.ginel.lib.service.dto.OrderUpdateDto;

import java.util.List;

public interface OrderService extends Service<OrderCreateDto, OrderUpdateDto, OrderGetDto>{

    List<OrderGetDto> findAllByStatus(OrderStatus status);
}
