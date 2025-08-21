package soft.club.taxizmati.models.rating;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;
import soft.club.taxizmati.enums.RatingType;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.user.User;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "rating")
public class Rating extends BaseEntity {

    private Float rating;
    @ManyToOne
    private User from_id;
    private RatingType ratingType;
}
