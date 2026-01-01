package az.edu.itbrains.freshshop.repository;

import az.edu.itbrains.freshshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
