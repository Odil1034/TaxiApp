package soft.club.taxizmati.service.userService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import soft.club.taxizmati.config.SessionUser;
import soft.club.taxizmati.dtos.registeration.LoginDTO;
import soft.club.taxizmati.dtos.registeration.SignUpDTO;
import soft.club.taxizmati.dtos.user.UserCreateDTO;
import soft.club.taxizmati.dtos.user.UserResponseDTO;
import soft.club.taxizmati.dtos.user.UserUpdateDTO;
import soft.club.taxizmati.mapper.UserMapper;
import soft.club.taxizmati.models.user.User;
import soft.club.taxizmati.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final SessionUser sessionUser;
    private final UserMapper userMapper;

    @Override
    public User getById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public UserResponseDTO login(LoginDTO loginDTO) {
        User user = userRepository.login(loginDTO.username(), loginDTO.password(), loginDTO.email());
//        System.out.println(user);
        return userMapper.toDTO(user);
    }

    @Override
    public boolean signup(SignUpDTO signupDTO) {
        User build = User.builder()
                .fullName(signupDTO.fullName())
                .email(signupDTO.email())
                .username(signupDTO.username())
                .password(signupDTO.password())
                .build();
        User save = userRepository.save(build);
        return true;
    }

    @Override
    public UserResponseDTO create(UserCreateDTO user) {
        User entity = userMapper.toEntity(user);
        User save = userRepository.save(entity);
        return userMapper.toDTO(save);
    }

    @Override
    public UserResponseDTO update(Long userId, UserUpdateDTO user) {
        User foundUser = getById(userId);
        userMapper.toEntity(user, foundUser);
        User save = userRepository.save(foundUser);
        return userMapper.toDTO(save);
    }

    @Override
    public void delete(Long id) {
        User byId = getById(id);
        userRepository.deleteById(id);
    }

    @Override
    public UserResponseDTO findById(Long id) {
        User byId = getById(id);
        return userMapper.toDTO(byId);
    }

    @Override
    public List<UserResponseDTO> getAll() {
        List<User> all = userRepository.findAll();
        return userMapper.toDTOList(all);
    }
}
