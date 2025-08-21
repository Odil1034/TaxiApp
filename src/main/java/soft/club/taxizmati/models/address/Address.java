package soft.club.taxizmati.models.address;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.user.User;

import java.lang.Double;
import java.util.List;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Address extends BaseEntity {

    @Column(columnDefinition = "varchar")
    private String city;
    private String district;
    private String street;
    private String number;
    private Double longitude;
    private Double latitude;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private User owner;


    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Address> address;

}
