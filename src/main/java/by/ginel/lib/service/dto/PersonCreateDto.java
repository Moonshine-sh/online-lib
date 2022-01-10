package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.PersonRole;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class PersonCreateDto extends AbstractCreateDto{

    private String firstName;
    private String lastName;
    private Boolean locked;
    private String login;
    private String password;
    private String email;
    private PersonRole role;
}
