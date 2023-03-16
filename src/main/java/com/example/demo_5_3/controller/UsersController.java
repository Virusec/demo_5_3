package com.example.demo_5_3.controller;

import com.example.demo_5_3.model.User;
import com.example.demo_5_3.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {
//    @Autowired
    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping("/users")
    public ResponseEntity<Void> createUser(@RequestBody User user) {
        usersService.createUser(user);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
        User user = usersService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
        usersService.deleteUserById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/users/name/{name}")
    public ResponseEntity<List<User>> getUsersByName(@PathVariable("name") String name) {
        List<User> users = usersService.getUsersByName(name);
        return ResponseEntity.ok(users);
    }
}
