package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.PersonRole;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class PersonGetDto extends AbstractGetDto{

    private Long id;
    private String firstName;
    private String lastName;
    private Boolean locked;
    private String login;
    private String password;
    private String email;
    private PersonRole role;
    private List<AbstractGetDto> addresses;
    private List<OrderGetDto> orders;
}
