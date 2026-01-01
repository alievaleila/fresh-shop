package az.edu.itbrains.freshshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {

    @PostMapping("/delete")
    public String delete() {
        return "redirect:/delete";

    }
}
