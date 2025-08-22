package soft.club.taxizmati.dtos.registeration;

import soft.club.taxizmati.dtos.BaseDTO;

public record LoginDTO(
        String username,
        String email,
        String password)
        implements BaseDTO {
}
