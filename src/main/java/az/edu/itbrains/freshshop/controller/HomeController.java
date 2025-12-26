package az.edu.itbrains.freshshop.controller;

import az.edu.itbrains.freshshop.dto.CategoryDto;
import az.edu.itbrains.freshshop.dto.ProductDto;
import az.edu.itbrains.freshshop.service.CategoryService;
import az.edu.itbrains.freshshop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final CategoryService categoryService;
    private final ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/about")
    public String about() {
        return "about.html";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact.html";
    }

    @GetMapping("/checkout")
    public String checkout() {
        return ".checkout.html";
    }

    @GetMapping("/gallery")
    public String gallery(Model model) {
        List<CategoryDto>categoryDtoList=categoryService.getAllCategories();
        model.addAttribute("categories",categoryDtoList);
        List<ProductDto>productDtoList=productService.getAllProducts();
        model.addAttribute("products",productDtoList);
        return "gallery.html";
    }

    @GetMapping("/shop")
    public String shop() {
        return "shop.html";
    }

    @GetMapping("/shop-detail")
    public String shopdetail() {
        return "shop-detail.html";
    }

    @GetMapping("/cart")
    public String cart() {
        return "cart.html";
    }
}
