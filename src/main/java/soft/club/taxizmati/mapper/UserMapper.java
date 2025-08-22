package soft.club.taxizmati.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import soft.club.taxizmati.dtos.registeration.SignUpDTO;
import soft.club.taxizmati.dtos.user.UserCreateDTO;
import soft.club.taxizmati.dtos.user.UserResponseDTO;
import soft.club.taxizmati.dtos.user.UserUpdateDTO;
import soft.club.taxizmati.models.user.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignUpDTO dto);

    User toEntity(UserCreateDTO dto);

    UserResponseDTO toDTO(User user);

    List<UserResponseDTO> toDTOList(List<User> users);

    void toEntity(UserUpdateDTO dto, @MappingTarget User user);

}
