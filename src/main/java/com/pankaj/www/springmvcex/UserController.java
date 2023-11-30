package com.pankaj.www.springmvcex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String homePage() {
        return "add-user";
    }

    @PostMapping("/users")
    public String getUser(@ModelAttribute("user") User user) {

        userService.saveUser(user);
        return "redirect:/";
    }
}
