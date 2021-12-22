package com.softuni.ecommerce.backend.repository;

import com.softuni.ecommerce.backend.model.AuthenticationToken;
import com.softuni.ecommerce.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Long> {

    AuthenticationToken findByUser(User user);
    AuthenticationToken findByToken(String token);
}
