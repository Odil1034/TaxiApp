package soft.club.taxizmati.dtos.car;

import soft.club.taxizmati.dtos.BaseDTO;

public record CarUpdateDTO(
        String color,
        String model,
        String brand
)
implements BaseDTO {
}
