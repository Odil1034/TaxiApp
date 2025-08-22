package soft.club.taxizmati.dtos.user;

import soft.club.taxizmati.dtos.BaseDTO;

public record UserResponseDTO(
        Long id,
        String password,
        String email,
        String fullName,
        String username
        ) implements BaseDTO {
}
