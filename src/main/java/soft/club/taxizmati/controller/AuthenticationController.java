package soft.club.taxizmati.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import soft.club.taxizmati.dtos.registeration.LoginDTO;
import soft.club.taxizmati.dtos.registeration.SignUpDTO;
import soft.club.taxizmati.dtos.user.UserResponseDTO;
import soft.club.taxizmati.service.userService.UserService;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final UserService userService;


    @GetMapping("/login")
    public ResponseEntity<UserResponseDTO> login(@RequestBody LoginDTO loginDTO) {
        UserResponseDTO user = userService.login(loginDTO);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/signup")
    public ResponseEntity<Boolean> signup(@RequestBody SignUpDTO signUpDTO) {
        boolean isTrue = userService.signup(signUpDTO);
        return ResponseEntity.ok(isTrue);
    }
}
