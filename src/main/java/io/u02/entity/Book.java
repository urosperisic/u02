package io.u02.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity @Data @Getter @Setter @NoArgsConstructor
public class Book {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

}
