package com.example.pokemon_team_builder.user;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository usRepository;

    public List<User> getUsers(){
        return (List<User>)usRepository.findAll();
    }

    public User getUser(int id) {
        return usRepository.findById(id).orElse(null);
    }

    public User insert(User u) {
        return usRepository.save(u);
    }

    public User update(User u, int id) {
        u.setUser_id(id);
        return usRepository.save(u);
    }
}
