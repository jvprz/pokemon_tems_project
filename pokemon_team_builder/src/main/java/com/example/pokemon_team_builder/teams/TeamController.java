package com.example.pokemon_team_builder.teams;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/teams")
@CrossOrigin(origins = "*")
public class TeamController {
    private final TeamService tmService;

    public TeamController(TeamService tmService){
        this.tmService = tmService;
    }

    @GetMapping
    public List<Team> gTeams() {
        return tmService.getTeams();
    }

    @GetMapping("/{id}")
    public Team gTeam(@PathVariable int id) {
        return tmService.getTeam(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Team insertTeam(@RequestBody Team c){
        return tmService.insert(c);
    }

    @PutMapping("/{id}")
    public Team updateTeam(@RequestBody Team t, @PathVariable int id) {
        return tmService.update(t, id);
    }
}