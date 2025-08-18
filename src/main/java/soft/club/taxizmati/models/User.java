package soft.club.taxizmati.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import soft.club.taxizmati.enums.Gender;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User extends BaseEntity {

    @NotBlank(message = "username is not empty")
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String fullName;
    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email format",
            regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,6}$")
    private String email;

    private Gender gender;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Address> address;


}
