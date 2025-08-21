package soft.club.taxizmati.models.image;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import soft.club.taxizmati.enums.ImageType;
import soft.club.taxizmati.models.BaseEntity;
import soft.club.taxizmati.models.user.User;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Image extends BaseEntity {

    @Column(name = "image_url", nullable = false)
    private String imageUrl;

    @Column(name = "image_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private ImageType imageType;

    @Column(name = "file_name", nullable = false, unique = true)
    private String fileName;

    @OneToOne(mappedBy = "profileImage")
    private User user;

}
