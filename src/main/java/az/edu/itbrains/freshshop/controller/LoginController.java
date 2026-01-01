package az.edu.itbrains.freshshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }
}
