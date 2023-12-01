package com.pankaj.www.springmvcex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String postUser(@ModelAttribute("user") User user) {

        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/listusers")
    public String getUsers(Model model) {
        List<User> users=userService.getUsers();
        model.addAttribute("users",users);
        return "list-users";
    }
}
