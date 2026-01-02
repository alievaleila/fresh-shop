package az.edu.itbrains.freshshop.repository;

import az.edu.itbrains.freshshop.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Long> {

    List<Cart> findByUserUsername(String username);
}
