package com.e_commerce.system.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_commerce.system.Entity.User;
import com.e_commerce.system.Service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create") // Make sure this endpoint exists
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.saveUser(user); // Assuming you have a saveUser method
        return ResponseEntity.ok(createdUser);
    }
}
