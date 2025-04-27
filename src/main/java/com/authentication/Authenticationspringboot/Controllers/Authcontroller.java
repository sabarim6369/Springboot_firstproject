package com.authentication.Authenticationspringboot.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.Authenticationspringboot.Modals.Authmodal;
import com.authentication.Authenticationspringboot.Repositories.Authrepo;

import java.util.*;

@RestController
public class Authcontroller {

    @Autowired
    Authrepo authrepo;

    @PostMapping("/api/signup")
    public String Signup(@RequestBody Authmodal authmodal) {
        List<Authmodal> data = authrepo.findAll();
        for (Authmodal user : data) {
            if (user.getEmail().equals(authmodal.getEmail())) {
                return "Email already exists!";
            }
        }
        authrepo.save(authmodal);
        return "Signup successful";
    }

    @PostMapping("/api/login")
    public String Login(@RequestBody Authmodal authmodal) {
        List<Authmodal> data = authrepo.findAll();
        for (Authmodal user : data) {
            if (user.getEmail().equals(authmodal.getEmail()) && user.getPassword().equals(authmodal.getPassword())) {
                return "Login Successful!";
            }
        }
        return "Invalid credentials!";
    }
}
