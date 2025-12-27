package az.edu.itbrains.freshshop.service.impl;

import az.edu.itbrains.freshshop.dto.ContactDto;
import az.edu.itbrains.freshshop.model.Contact;
import az.edu.itbrains.freshshop.repository.ContactRepository;
import az.edu.itbrains.freshshop.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    public void addContact(ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setName(contactDto.getName());
        contact.setSubject(contactDto.getSubject());
        contact.setEmail(contactDto.getEmail());
        contact.setMessage(contactDto.getMessage());

        contactRepository.save(contact);
    }
}
