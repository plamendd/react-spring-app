package com.softuni.ecommerce.backend.service;

import com.softuni.ecommerce.backend.exceptions.AuthenticationFailException;
import com.softuni.ecommerce.backend.model.AuthenticationToken;
import com.softuni.ecommerce.backend.model.User;
import com.softuni.ecommerce.backend.repository.TokenRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AuthenticationService {


    private final  TokenRepository tokenRepository;

    public AuthenticationService(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
    }

    public void saveConfirmationToken(AuthenticationToken authenticationToken) {
        tokenRepository.save(authenticationToken);
    }

    public AuthenticationToken getToken(User user) {
        return tokenRepository.findByUser(user);
    }


    public User getUser(String token) {
        final AuthenticationToken authenticationToken = tokenRepository.findByToken(token);
        if(Objects.isNull(authenticationToken)) {
            return null;
        }
        // authenticationToken is not null
        return authenticationToken.getUser();
    }

    public void authenticate(String token) throws AuthenticationFailException {
        // null check
        if(Objects.isNull(token)) {
            // throw an exception
            throw new AuthenticationFailException("token not present");
        }
        if(Objects.isNull(getUser(token))) {
            throw new AuthenticationFailException("token not valid");
        }
    }
}
