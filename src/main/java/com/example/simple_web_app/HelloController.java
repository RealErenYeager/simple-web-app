package com.example.simple_web_app; // Ensure this matches your package structure

import org.springframework.stereotype.Controller; // Import Controller
import org.springframework.ui.Model; // Import Model
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Use @Controller for rendering HTML views
public class HelloController { // Ensure it is public
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "User"); // You can change "User" to any name you like
        return "hello"; // This corresponds to hello.html
    }

    @GetMapping("/greet")
    public String greet() {
        return "Greetings from Spring Boot!"; // This can still return a simple string
    }
}
