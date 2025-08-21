package soft.club.taxizmati.models.role;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.permission.Permission;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Role extends BaseEntity {

    private String role;

    @ManyToMany
    @JoinTable(
            name = "roles_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> permissionList;

    public Role(String role) {
        this.role = "ROLE_" + role.toUpperCase();
    }
}
