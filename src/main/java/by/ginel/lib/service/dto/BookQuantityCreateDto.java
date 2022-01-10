package by.ginel.lib.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class BookQuantityCreateDto extends AbstractCreateDto{

    private Long quantity;
}
