package com.booking.airlinebookingsystem.controllers;

import com.booking.airlinebookingsystem.entities.User;
import com.booking.airlinebookingsystem.services.RegisterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    private RegisterService registerService;
    @PostMapping("/register")
    public ResponseEntity<Void> addUser(@RequestBody User user){
        int response = registerService.addUser(user);
        if(response == 1){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
