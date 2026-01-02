package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.CartItemDto;
import az.edu.itbrains.freshshop.model.Cart;
import az.edu.itbrains.freshshop.repository.CartRepository;
import az.edu.itbrains.freshshop.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Override
    public List<CartItemDto> getCartItemUsername(String username) {
        List<Cart> carts = cartRepository.findByUserUsername(username);

        return carts.stream().map(cart -> new CartItemDto(cart.getId(), cart.getProduct().getId(), cart.getName(), cart.getImageUrl(), cart.getPrice(), cart.getQuantity())).toList();
    }


}
