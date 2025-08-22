package soft.club.taxizmati.models.car.model;

import jakarta.persistence.MappedSuperclass;
import lombok.*;
import soft.club.taxizmati.models.BaseEntity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class Model extends BaseEntity {
    private String manufacturer;
    private String modelName;
    private int power;
}
