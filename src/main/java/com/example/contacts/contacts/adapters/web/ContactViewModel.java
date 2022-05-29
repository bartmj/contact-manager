package com.example.contacts.contacts.adapters.web;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ContactViewModel {

    @NotEmpty
    private String name;
    @NotEmpty
    private String phone;

}
