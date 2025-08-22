package soft.club.taxizmati.dtos.user;

import soft.club.taxizmati.dtos.BaseDTO;

public record UserUpdateDTO(
    String username,
    String password,
    String fullName,
    String email
) implements BaseDTO {
}
