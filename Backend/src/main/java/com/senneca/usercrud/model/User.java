package com.senneca.usercrud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty
    private Long id;
    
    @JsonProperty
    private String firstName;
    
    @JsonProperty
    private String lastName;
    
    @JsonProperty
    private String email;
    
    @JsonProperty
    private LocalDate birthDate;

    public void setId(Long id) {
        this.id = id;
    }
}


