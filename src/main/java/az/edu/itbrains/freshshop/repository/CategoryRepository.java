package az.edu.itbrains.freshshop.repository;

import az.edu.itbrains.freshshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
