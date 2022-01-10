package by.ginel.lib.service.dto;


import by.ginel.lib.dao.entity.PersonRole;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@Builder
public class PersonUpdateDto extends AbstractUpdateDto{

    private Long id;
    private String firstName;
    private String lastName;
    private Boolean locked;
    private String login;
    private String password;
    private String email;
    private PersonRole role;
}
