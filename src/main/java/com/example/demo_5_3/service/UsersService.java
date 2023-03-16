package com.example.demo_5_3.service;

import com.example.demo_5_3.model.User;
import com.example.demo_5_3.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
//    @Autowired
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public void createUser(User user) {
        usersRepository.save(user);
    }

    public User getUserById(Integer id) {
        return usersRepository.getById(id);
    }

    public void deleteUserById(Integer id) {
        usersRepository.getById(id);
    }

    public List<User> getUsersByName(String name) {
        return usersRepository.getUsersByName(name);
    }
}
