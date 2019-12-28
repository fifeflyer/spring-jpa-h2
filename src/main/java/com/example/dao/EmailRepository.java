package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, String> {
}
