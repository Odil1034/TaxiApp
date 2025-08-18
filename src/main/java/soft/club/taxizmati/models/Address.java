package soft.club.taxizmati.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Address extends BaseEntity {

    private String city;
    private String district;
    private String street;
    private String number;
    private BigDecimal longitude;
    private BigDecimal latitude;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
