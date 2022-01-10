package by.ginel.lib.service.mapper;

import by.ginel.lib.dao.entity.Order;
import by.ginel.lib.service.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {

    Order orderCreateDtoToOrder(OrderCreateDto orderCreateDto);
    Order orderUpdateDtoToOrder(OrderUpdateDto orderUpdateDto);
    OrderGetDto orderToOrderGetDto(Order order);
}
