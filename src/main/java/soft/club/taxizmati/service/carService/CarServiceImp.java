package soft.club.taxizmati.service.carService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soft.club.taxizmati.dtos.car.CarCreateDTO;
import soft.club.taxizmati.dtos.car.CarResponseDTO;
import soft.club.taxizmati.dtos.car.CarUpdateDTO;
import soft.club.taxizmati.mapper.CarMapper;
import soft.club.taxizmati.models.car.model.Car;
import soft.club.taxizmati.repository.CarRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CarServiceImp implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public CarResponseDTO create(CarCreateDTO dto) {
        Car entity = carMapper.toEntity(dto);
        Car save = carRepository.save(entity);
        return carMapper.toResponse(save);
    }

    @Override
    public CarResponseDTO update(Long carId, CarUpdateDTO car) {
        Car dbCar = getById(carId);
        carMapper.toEntity(car, dbCar);
        Car save = carRepository.save(dbCar);
        return carMapper.toResponse(save);
    }

    @Override
    public void delete(Long id) {
        getById(id);
        carRepository.deleteById(id);
    }

    @Override
    public CarResponseDTO findById(Long id) {
        Car car = getById(id);
        return carMapper.toResponse(car);
    }

    private Car getById(Long carId) {
        return carRepository.findById(carId)
                .orElseThrow(() ->
                        new RuntimeException("Car not found by id = " + carId));
    }

    @Override
    public List<CarResponseDTO> getAll() {
        List<Car> all = carRepository.findAll();
        return carMapper.toList(all);
    }

}
