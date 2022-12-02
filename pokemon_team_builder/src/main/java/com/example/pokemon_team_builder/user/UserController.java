package com.example.pokemon_team_builder.user;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class UserController {
    private final UserService usService;

    public UserController(UserService usService) {
        this.usService = usService;
    }

    @GetMapping
    public List<User> getUsers() {
        return usService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
        return usService.getUser(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User insertUser(@RequestBody User c) {
        return usService.insert(c);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User c, @PathVariable int id) {
        return usService.update(c, id);
    }
}
