package soft.club.taxizmati.service.userService;

import soft.club.taxizmati.dtos.user.UserUpdateDTO;
import soft.club.taxizmati.dtos.registeration.LoginDTO;
import soft.club.taxizmati.dtos.registeration.SignUpDTO;
import soft.club.taxizmati.dtos.user.UserCreateDTO;
import soft.club.taxizmati.dtos.user.UserResponseDTO;
import soft.club.taxizmati.models.user.User;
import soft.club.taxizmati.service.BaseService;

public interface UserService extends BaseService<User,
        UserCreateDTO, UserUpdateDTO, UserResponseDTO> {

    User getById(Long id);

    UserResponseDTO login(LoginDTO loginDTO);

    boolean signup(SignUpDTO signUpDTO);

}
