package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.Book;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class BookCoverGetDto extends AbstractGetDto{

    private Long id;
    private String name;
    private String picPath;
    private Book book;
}
