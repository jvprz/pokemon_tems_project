package com.example.pokemon_team_builder.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Table("user")
public class User {
    @Id private int user_id;
        private String username;
        private String description;
        private String password;
}