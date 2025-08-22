package soft.club.taxizmati.models.car.model;

import jakarta.persistence.Entity;
import lombok.*;
import soft.club.taxizmati.models.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public abstract class Car extends BaseEntity {

    private Integer distanceDriven;
    private String licensePlate;
    private String color;
    private Model model;

}
