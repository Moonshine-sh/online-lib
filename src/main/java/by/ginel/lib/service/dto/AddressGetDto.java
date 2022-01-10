package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.Person;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Builder
public class AddressGetDto extends AbstractGetDto{

    private Long id;
    private String city;
    private String street;
    private String house;
    private String flat;
    private Long personId;
}
