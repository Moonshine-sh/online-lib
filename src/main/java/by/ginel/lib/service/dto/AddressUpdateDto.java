package by.ginel.lib.service.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Builder
public class AddressUpdateDto extends AbstractUpdateDto{

    private Long id;
    private String city;
    private String street;
    private String house;
    private String flat;
    private Long personId;
}
