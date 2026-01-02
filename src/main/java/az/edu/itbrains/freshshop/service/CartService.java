package az.edu.itbrains.freshshop.service;

import az.edu.itbrains.freshshop.dto.CartItemDto;

import java.util.List;

public interface CartService {

    List<CartItemDto> getCartItemUsername(String username);

    void addToCart(String username, Long productId);
}
