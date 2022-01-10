package by.ginel.lib.service.dto;

import by.ginel.lib.dao.entity.Book;

public class BookQuantityUpdateDto extends AbstractUpdateDto{

    private Long id;
    private Long quantity;
    private Long bookId;
}
