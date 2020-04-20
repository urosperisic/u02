package io.u02.mapper;

import io.u02.entity.BookEntity;
import io.u02.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
@Mapper(componentModel ="spring")
public interface BookMapper {
    @Mapping(source = "id", target = "id")
    BookEntity mapToEntity(Book book);
    List<BookEntity> mapToEntity(List<Book> books);
    Book mapToModel(BookEntity entity);
    List<Book> mapToModel(List<BookEntity> entities);
    Book mapToModel(Optional<BookEntity> entity);
}
