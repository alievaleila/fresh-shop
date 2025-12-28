package az.edu.itbrains.freshshop.repository;

import az.edu.itbrains.freshshop.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}
