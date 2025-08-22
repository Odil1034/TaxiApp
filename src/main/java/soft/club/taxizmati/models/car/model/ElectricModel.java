package soft.club.taxizmati.models.car.model;

import jakarta.persistence.MappedSuperclass;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class ElectricModel extends Car {

    private int batteryCapacity;
    private int energyConsumption;

}
