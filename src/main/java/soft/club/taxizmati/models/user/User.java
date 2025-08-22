package soft.club.taxizmati.models.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import soft.club.taxizmati.models.BaseEntity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users")
public class User extends BaseEntity {
    @Column(unique = true, nullable = false)
    private String username;
    private String password;

    @Column(name = "full_name")
    private String fullName;
    @Column(unique = true)
    private String email;
}
