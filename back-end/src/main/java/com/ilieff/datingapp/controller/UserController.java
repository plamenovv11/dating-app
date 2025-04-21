package com.ilieff.datingapp.controller;

import com.ilieff.datingapp.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok("Dating App API is working!");
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        // TODO: Implement user registration logic
        return ResponseEntity.ok("User registration endpoint");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUser(@PathVariable Long id) {
        // TODO: Implement get user logic
        return ResponseEntity.ok("Get user endpoint for ID: " + id);
    }
} 