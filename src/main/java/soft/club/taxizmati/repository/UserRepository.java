package soft.club.taxizmati.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import soft.club.taxizmati.models.user.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE (u.username = :username OR u.email = :email) AND u.password = :password")
    User login(@Param("username") String username,
               @Param("password") String password,
               @Param("email") String email);

}
