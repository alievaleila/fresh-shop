package az.edu.itbrains.freshshop.controller;

import az.edu.itbrains.freshshop.dto.CartItemDto;
import az.edu.itbrains.freshshop.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/cart")
    public String cart(Model model, Principal principal) {
        if (principal == null) {
            return "redirect:/login";
        }
        String username = principal.getName();
        List<CartItemDto> cartItemDtoList = cartService.getCartItemUsername(username);
        model.addAttribute("cartItems", cartItemDtoList);
        return "cart.html";
    }

    @PostMapping("/cart/add")
    public String addToCart(@RequestParam Long productId, Principal principal) {
        if (principal == null) {
            return "redirect:/login";
        }
        String username = principal.getName();
        cartService.addToCart(username, productId);
        return "redirect:/cart";
    }

    @PostMapping("/delete")
    public String delete() {
        return "redirect:/delete";

    }
}
