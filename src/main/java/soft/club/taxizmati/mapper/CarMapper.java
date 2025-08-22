package soft.club.taxizmati.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import soft.club.taxizmati.dtos.car.CarCreateDTO;
import soft.club.taxizmati.dtos.car.CarResponseDTO;
import soft.club.taxizmati.dtos.car.CarUpdateDTO;
import soft.club.taxizmati.models.car.model.Car;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car toEntity(CarCreateDTO dto);

    CarResponseDTO toResponse(Car entity);

    List<CarResponseDTO> toList(List<Car> entityList);

    void toEntity(CarUpdateDTO car, @MappingTarget Car dbCar);
}
