package soft.club.taxizmati.models.car.model;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class RegularModel extends Model {

    private int engineDisplacement;
    private double fuelConsumption;

}
