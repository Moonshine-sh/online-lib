package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.Genre;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class BookUpdateDto extends AbstractUpdateDto{

    private Long id;
    private String name;
    private String author;
    private String description;
    private Double price;
    private Genre genre;
}
