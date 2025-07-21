package com.LoginApplication.proj.Service;

import com.LoginApplication.proj.Model.User;
import com.LoginApplication.proj.Repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user) throws Exception {
        if(userRepository.findByUsername(user.getUsername()) != null) {
            throw new Exception("Username already exists");
        }
        userRepository.save(user);
    }
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public User findByEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
