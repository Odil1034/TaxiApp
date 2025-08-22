package soft.club.taxizmati.models.car;


import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.models.car.model.Car;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@SuperBuilder
@Entity
public class ElectricCar extends Car {

    private int batteryLevel;

}
