package com.turntalien.blog.controller;

import com.turntalien.blog.Dto.RegisterRequest;
import com.turntalien.blog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/auth")
@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody  RegisterRequest registerRequest) {
       authService.signup(registerRequest);
       return new ResponseEntity(HttpStatus.OK);
    }


}
