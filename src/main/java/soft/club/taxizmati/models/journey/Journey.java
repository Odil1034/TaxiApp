package soft.club.taxizmati.models.journey;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.enums.PaymentType;
import soft.club.taxizmati.enums.PreferredPlaceType;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.address.Address;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class Journey extends BaseEntity {

    @OneToOne
    private Address from;

    @OneToOne
    @JoinColumn(name = "to")
    private Address to;

    @Column(name = "arrival_time", updatable = false)
    private LocalDateTime arrivalTime;

    @ElementCollection(targetClass = PreferredPlaceType.class)
    @Enumerated(EnumType.STRING)
    private Set<PreferredPlaceType> preferredPlace;

    private Double totalPrice;

    private PaymentType paymentType;
}
