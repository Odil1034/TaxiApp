package soft.club.taxizmati.models.car;


import jakarta.persistence.*;
import lombok.*;
import soft.club.taxizmati.enums.CarCompanyNames;
import soft.club.taxizmati.enums.RatingType;
import soft.club.taxizmati.enums.car.CarType;
import soft.club.taxizmati.enums.car.FuelType;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.user.User;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cars")
public class Car extends BaseEntity {

    private Float rating;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;

    @Enumerated(EnumType.STRING)
    private CarType type;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @Enumerated(EnumType.STRING)
    private RatingType ratingType;

    private String name;

    @Column(name = "company_name")
    private CarCompanyNames companyName;

    private String number;

    private Integer countOfSeats;
}
