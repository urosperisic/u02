package io.u02.mapper;

import io.u02.entity.BookEntity;
import io.u02.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel ="spring")
public interface BookMapper {
    @Mapping(target = "id", ignore = true)
    BookEntity mapToEntity(Book book);
    Book mapToModel(BookEntity entity);
}
