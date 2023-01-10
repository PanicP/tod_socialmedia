package com.example.controller;
import com.example.type.Register;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/register")
    public Register register(
        @RequestParam(value = "username", defaultValue = "DefaultUser") String name, 
        @RequestParam(value="password", defaultValue = "password@123") String password) {
    
		return new Register(String.format(name),String.format(password));
	}
}
