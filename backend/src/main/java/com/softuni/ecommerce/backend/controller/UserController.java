package com.softuni.ecommerce.backend.controller;

import com.softuni.ecommerce.backend.dto.ResponseDto;
import com.softuni.ecommerce.backend.dto.SignInDto;
import com.softuni.ecommerce.backend.dto.SignInReponseDto;
import com.softuni.ecommerce.backend.dto.SignUpDto;
import com.softuni.ecommerce.backend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

   private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // two apis

    // signup

    @PostMapping("/signup")
    public ResponseDto signup(@RequestBody SignUpDto signUpDto) {
        return userService.signUp(signUpDto);
    }


    // signin

    @PostMapping("/signin")
    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
        return userService.signIn(signInDto);
    }


}
