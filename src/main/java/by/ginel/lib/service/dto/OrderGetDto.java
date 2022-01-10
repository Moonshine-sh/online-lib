package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.OrderBook;
import by.ginel.lib.dao.entity.OrderStatus;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Builder
public class OrderGetDto extends AbstractGetDto{

    private Long id;
    private Date date;
    private OrderStatus status;
    private Long personId;
    private List<OrderBook> books;
}
