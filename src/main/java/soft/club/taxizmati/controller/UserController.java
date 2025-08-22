package soft.club.taxizmati.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import soft.club.taxizmati.dtos.user.UserResponseDTO;
import soft.club.taxizmati.dtos.user.UserUpdateDTO;
import soft.club.taxizmati.service.userService.UserService;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/get/{id}")
    public ResponseEntity<UserResponseDTO> getById(@PathVariable Long id) {
        UserResponseDTO userDTO = userService.findById(id);
        return ResponseEntity.ok(userDTO);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@RequestBody UserUpdateDTO user,
                                                      @PathVariable Long id) {
        UserResponseDTO update = userService.update(id, user);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.ok("User is deleted by id " + id);
    }
}
