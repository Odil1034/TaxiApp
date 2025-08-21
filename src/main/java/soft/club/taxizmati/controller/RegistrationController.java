package soft.club.taxizmati.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import soft.club.taxizmati.dtos.LoginDTO;

@RestController
@RequiredArgsConstructor
@RequestMapping("auth")
public class RegistrationController {

    @GetMapping("/login")
    public ResponseEntity<LoginDTO> login() {

        return new ResponseEntity<>(null);
    }

    @PostMapping("/signup")
    public ResponseEntity<LoginDTO> signup() {
        return ResponseEntity.ok(null);
    }
}
