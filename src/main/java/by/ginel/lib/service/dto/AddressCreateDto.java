package by.ginel.lib.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class AddressCreateDto extends AbstractCreateDto{

    private String city;
    private String street;
    private String house;
    private String flat;
}
