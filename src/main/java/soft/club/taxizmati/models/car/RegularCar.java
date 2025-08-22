package soft.club.taxizmati.models.car;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.models.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class RegularCar extends BaseEntity {

}
