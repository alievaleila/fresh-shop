package az.edu.itbrains.freshshop.repository;

import az.edu.itbrains.freshshop.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
