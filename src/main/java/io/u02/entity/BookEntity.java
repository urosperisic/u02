package io.u02.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@Data
public class BookEntity {
    @Id
    private Long id;
    private String title;
}
