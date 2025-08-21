package soft.club.taxizmati.models.permission;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.role.Role;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Permission extends BaseEntity {

    @ManyToMany(mappedBy = "permissionList")
    private List<Role> roles;
}
