package com.example.controller;
import com.example.type.Register;
import com.example.type.DeleteAcc;
import com.example.type.Login;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/register")
    public Register register(
        @RequestParam(value = "username", defaultValue = "DefaultUser") String name, 
        @RequestParam(value="password", defaultValue = "password@123") String password){
    
		return new Register(String.format(name), String.format(password), UUID.randomUUID());
	}

    @GetMapping("/login")
    public Login login(
        @RequestParam(value = "username", defaultValue = "DefaultUser") String name, 
        @RequestParam(value="password", defaultValue = "password@123") String password) {
    
		return new Login(String.format(name),String.format(password));
	}

    
    @GetMapping("/deleteacc/{userId}")
    public DeleteAcc DeleteAcc(@PathVariable("userId") String userID){
		return new DeleteAcc(UUID.fromString(userID));
	}

}
