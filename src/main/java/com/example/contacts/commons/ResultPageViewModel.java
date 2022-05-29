package com.example.contacts.commons;

import lombok.Data;

import java.util.List;

@Data
public class ResultPageViewModel<T> {

    private List<T> data;
    private int pageNumber;
    private Long totalPages;

}
