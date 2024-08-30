package com.mongo.api.model.request;

import lombok.Data;

import java.time.Instant;

@Data
public class BookCreationRequest {
    private String name;
    private String isbn;
    private String authorId;
    private Instant timing;
}
