package by.ginel.lib.service.mapper;

import by.ginel.lib.dao.entity.BookCover;
import by.ginel.lib.service.dto.BookCoverCreateDto;
import by.ginel.lib.service.dto.BookCoverGetDto;
import by.ginel.lib.service.dto.BookCoverUpdateDto;
import org.mapstruct.Mapper;

@Mapper
public interface BookCoverMapper {

    BookCover bookCoverCreateDtoToBookCover(BookCoverCreateDto bookCoverCreateDto);
    BookCover bookCoverUpdateDtoToBookCover(BookCoverUpdateDto bookCoverUpdateDto);
    BookCoverGetDto bookCoverToBookCoverGetDto(BookCover bookCover);
}
