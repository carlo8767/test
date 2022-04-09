package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
    @Autowired
    UtentiRepository repo;
     
    @GetMapping("/users")
    public String listAll(Model model) {
        List<Utenti> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);

        return "users";
    }
     
}
