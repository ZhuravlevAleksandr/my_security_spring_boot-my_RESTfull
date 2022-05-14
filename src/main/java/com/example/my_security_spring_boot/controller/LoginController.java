package com.example.my_security_spring_boot.controller;

import com.example.my_security_spring_boot.models.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/user")
    public String userData(@AuthenticationPrincipal User activeUser, Model model) {
        model.addAttribute("roles", activeUser.getRoles());
        model.addAttribute("activeUser", activeUser);
        return "user";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
