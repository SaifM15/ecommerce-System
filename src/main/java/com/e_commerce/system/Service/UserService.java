package com.e_commerce.system.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.system.Entity.User;
import com.e_commerce.system.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findById(Long userId) {
        // Use Optional to avoid NullPointerException
        Optional<User> user = userRepository.findById(userId);
        
        // Handle user not found scenario
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new RuntimeException("User not found with id: " + userId);
        }
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}

