package az.edu.itbrains.freshshop.repository;

import az.edu.itbrains.freshshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
