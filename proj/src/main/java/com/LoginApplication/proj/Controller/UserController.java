package com.LoginApplication.proj.Controller;


import com.LoginApplication.proj.Model.User;
import com.LoginApplication.proj.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignUpPage() {
        return "signup"; // Renders signup.html
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "loginpage"; // Renders loginpage.html
    }

    @GetMapping("/welcome")
    public String showWelcomePage(Model model) {
        // Add user info to model if needed
        model.addAttribute("username", "Aditya");
        model.addAttribute("id", 1L);
        return "Welcome"; // Renders welcome.html
    }
    @GetMapping("/logout")
    public String logout(Model model) {
        model.addAttribute("message", "You have been logged out successfully.");
        return "loginpage"; // Redirects to login page after logout
    }
    @GetMapping("/userbase")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "userbase"; // Assuming you have a method to get all users
    }
    @PostMapping("/signup")
    public String signUp(@ModelAttribute User user, Model model) {
        try {
            userService.saveUser(user);
            model.addAttribute("username", user.getUsername());
            return "Welcome";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            System.out.println("New user registered: " + user.getUsername());
            return "signup";
        }
    }

    @PostMapping("/login")
    public String loginPage(@RequestParam String username, @RequestParam String password, Model model) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("username", user.getUsername());
            model.addAttribute("id", user.getId());
            return "Welcome";
        } else {
            model.addAttribute("error", "Invalid credentials!");
            return "loginpage";
        }
    }

    @PostMapping("/welcome")
    public String welcome(@RequestBody User user) {
        User existingUser = userService.findByUsername(user.getUsername());
        if (existingUser != null) {
            return "Welcome back, " + existingUser.getUsername() + "!";
        } else {
            return "User not found. Please sign up first.";
        }
    }


}
