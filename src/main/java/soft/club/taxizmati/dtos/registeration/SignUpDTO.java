package soft.club.taxizmati.dtos.registeration;

import soft.club.taxizmati.dtos.BaseDTO;

public record SignUpDTO(
        String username,
        String password,
        String fullName,
        String email
) implements BaseDTO {

}
