package soft.club.taxizmati.dtos.car;

import soft.club.taxizmati.dtos.BaseDTO;

import java.time.LocalDate;

public record CarCreateDTO(
        String color,
        String model,
        String brand,
        LocalDate year
) implements BaseDTO {
}
