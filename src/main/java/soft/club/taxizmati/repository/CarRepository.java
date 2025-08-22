package soft.club.taxizmati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soft.club.taxizmati.models.car.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
