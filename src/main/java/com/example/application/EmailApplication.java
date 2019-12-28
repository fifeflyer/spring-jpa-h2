package com.example.application;

import com.example.dao.EmailRepository;
import com.example.entity.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.example.entity.Email.email;

@Service
public class EmailApplication {

    private final EmailRepository repository;

    @Autowired
    public EmailApplication(EmailRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public List<Email> getAll() {
        return repository.findAll();
    }

    @Transactional
    public Email createAndSave() {
        return repository.save(email().withEmailAddress("foobar@test.com"));
    }
}
