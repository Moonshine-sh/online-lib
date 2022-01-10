package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.Genre;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class BookCreateDto extends AbstractCreateDto{

    private String name;
    private String author;
    private String description;
    private Double price;
    private Genre genre;
}
