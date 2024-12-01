package com.mehmetberkan.springsecurityjwtexample.security.auth;

import com.mehmetberkan.springsecurityjwtexample.security.model.AuthRequest;
import com.mehmetberkan.springsecurityjwtexample.security.model.AuthResponse;
import com.mehmetberkan.springsecurityjwtexample.security.model.UserDto;
import com.mehmetberkan.springsecurityjwtexample.security.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/save")
    public ResponseEntity<AuthResponse> saveUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(authService.save(userDto));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthResponse> createAuthenticationToken(@RequestBody AuthRequest authRequest) throws Exception {
        return ResponseEntity.ok(authService.authenticate(authRequest));
    }
}
