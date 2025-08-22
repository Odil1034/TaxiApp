package soft.club.taxizmati.service.carService;

import soft.club.taxizmati.dtos.car.CarCreateDTO;
import soft.club.taxizmati.dtos.car.CarResponseDTO;
import soft.club.taxizmati.dtos.car.CarUpdateDTO;
import soft.club.taxizmati.models.car.model.Car;
import soft.club.taxizmati.service.BaseService;

public interface CarService extends BaseService<Car, CarCreateDTO, CarUpdateDTO, CarResponseDTO> {


}
