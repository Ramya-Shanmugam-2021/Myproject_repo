package com.samplebankingapp.sampletechbank.dto;

import org.antlr.v4.runtime.misc.NotNull;

//import jakarta.validation.constraints.Email;
//import jakarta.persistence.*;
//import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto
{
    private Long id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;
}