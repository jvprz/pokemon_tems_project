package com.example.pokemon_team_builder.teams;

import java.util.List;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository tmRepository;

    public List<Team> getTeams(){
        return (List<Team>)tmRepository.findAll();
    }
    
    public Team getTeam(int id) {
        return tmRepository.findById(id).orElse(null);
    }

    public Team insert(Team t){
        return tmRepository.save(t);
    }

    public Team update(Team t, int id) {
        t.setId_team(id);
        return tmRepository.save(t);
    }
}
