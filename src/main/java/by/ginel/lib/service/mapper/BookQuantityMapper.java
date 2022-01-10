package by.ginel.lib.service.mapper;


import by.ginel.lib.dao.entity.BookQuantity;
import by.ginel.lib.service.dto.*;
import org.mapstruct.Mapper;

@Mapper
public interface BookQuantityMapper {

    BookQuantity bookQuantityCreateDtoToBookQuantity(BookQuantityCreateDto bookQuantityCreateDto);
    BookQuantity bookQuantityUpdateDtoToBookQuantity(BookQuantityUpdateDto bookQuantityUpdateDto);
    BookQuantityGetDto bookQuantityToBookQuantityGetDto(BookQuantity bookQuantity);
}
