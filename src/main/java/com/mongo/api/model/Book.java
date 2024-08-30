package com.mongo.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Getter
@Setter
@Document
public class Book {

    @Id
    private String id;
    private String name;
    private String isbn;
    private Instant timing;
    @DBRef
    private Author author;

}
