package de.pksoftware.learning.java_spring_boot.creating_web_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("welcome")
    public String welcome(Model model){
        System.out.println("Method welcome has been executed!");

        model.addAttribute("message", "Hello from the backend server: " + Double.toString(Math.random()) );

        return "Welcome";

    }

}
