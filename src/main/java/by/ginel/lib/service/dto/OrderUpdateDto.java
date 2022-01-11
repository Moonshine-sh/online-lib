package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.OrderStatus;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class OrderUpdateDto extends AbstractUpdateDto{

    private Long id;
    private Date date;
    private OrderStatus status;
    private Long personId;
}
