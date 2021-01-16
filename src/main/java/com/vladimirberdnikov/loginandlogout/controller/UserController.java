package com.vladimirberdnikov.loginandlogout.controller;

import com.vladimirberdnikov.loginandlogout.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new User());
        return "login";
    }

    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute User user, Model model) {
        model.addAttribute("login", user);
        if (user.getUsername().equals("user") && user.getPassword().equals("111111")) {
            return "result";
        }
        else {
            return "login";
        }
    }

}
