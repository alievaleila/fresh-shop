package az.edu.itbrains.freshshop.controller;

import az.edu.itbrains.freshshop.dto.RegisterDto;
import az.edu.itbrains.freshshop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @GetMapping("/register")
    public String register() {
        return "register.html";
    }

    @PostMapping("/register")
    public String register(RegisterDto registerDto, RedirectAttributes redirectAttributes) {
        boolean result = userService.registerUser(registerDto);
        if (result) {
            redirectAttributes.addFlashAttribute("success", "Registration successful! Please log in.");
            return "redirect:/register";
        }
        redirectAttributes.addFlashAttribute("errorMessage", "Registration failed. Email might be in use.");
        return "redirect:/register";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("loginError", "Invalid username or password.");
        }
        return "register";
    }
}
