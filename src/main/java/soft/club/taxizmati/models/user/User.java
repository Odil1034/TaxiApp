package soft.club.taxizmati.models.user;

import jakarta.persistence.*;
import lombok.*;
import soft.club.taxizmati.enums.Gender;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.address.Address;
import soft.club.taxizmati.models.car.Car;
import soft.club.taxizmati.models.image.Image;

import java.time.LocalDate;
import java.util.List;

//import jakarta.validation.constraintsec.Email;
//import jakarta.validation.constraints.NotBlank;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User extends BaseEntity {

//    @NotBlank(message = "username is not empty")
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @NotBlank(message = "Email cannot be empty")
//    @Email(message = "Invalid email format",
//            regexp = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\\\.[A-Za-z]{2,6}$")
//    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Car> userCars;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Address> address;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @Column(name = "birth_date")
    private LocalDate birthDay;


    @OneToOne
    @JoinColumn(name = "image_id")
    private Image profileImage;

}
