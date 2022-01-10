package by.ginel.lib.service.mapper;


import by.ginel.lib.dao.entity.OrderBook;
import by.ginel.lib.service.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface OrderBookMapper {

    OrderBook orderBookCreateDtoToOrderBook(OrderBookCreateDto orderBookCreateDto);
    OrderBook orderBookUpdateDtoToOrderBook(OrderBookUpdateDto orderBookUpdateDto);
    OrderBookGetDto orderBookToOrderBookGetDto(OrderBook orderBook);
}
