package soft.club.taxizmati.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import soft.club.taxizmati.dtos.car.CarCreateDTO;
import soft.club.taxizmati.dtos.car.CarResponseDTO;
import soft.club.taxizmati.dtos.car.CarUpdateDTO;
import soft.club.taxizmati.service.carService.CarService;

import java.util.List;

@RestController
@RequestMapping("car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<CarResponseDTO> getCar(@PathVariable Long id) {
        CarResponseDTO carDTO = carService.findById(id);
        return ResponseEntity.ok(carDTO);
    }

    @PostMapping(value = "/create", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CarResponseDTO> createCar(@RequestBody CarCreateDTO car) {
        CarResponseDTO carDTO = carService.create(car);
        return ResponseEntity.ok(carDTO);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<CarResponseDTO> updateCar(@RequestBody CarUpdateDTO car,
                                                    @PathVariable("id") Long carId) {
        CarResponseDTO update = carService.update(carId, car);
        return ResponseEntity.ok(update);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        carService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get-all")
    public List<CarResponseDTO> getAllCars() {
        return carService.getAll();
    }

}
