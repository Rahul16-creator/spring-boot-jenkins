package com.example.redi_swagger.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    private int id;
    private String name;
    private String email;
    private String password;
}
