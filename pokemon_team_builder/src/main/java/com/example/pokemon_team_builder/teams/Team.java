package com.example.pokemon_team_builder.teams;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
@Table("team")
public class Team {
    @Id private int id_team;
        private int id_user;
        private int pokemon_slot_01;
        private int pokemon_slot_02;
        private int pokemon_slot_03;
        private int pokemon_slot_04;
        private int pokemon_slot_05;
        private int pokemon_slot_06;
        private String team_name;
}
