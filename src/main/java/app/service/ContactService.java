package app.service;

import app.entity.Contact;

import java.util.List;

public interface ContactService {
    boolean create(Contact contact);
    List<Contact> fetchAll();
    Contact fetchById(Long id);
    boolean update(Long id, Contact contact);
    boolean delete(Long id);
}
