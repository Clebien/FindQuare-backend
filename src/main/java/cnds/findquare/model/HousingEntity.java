package cnds.findquare.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.query.criteria.internal.expression.function.CurrentTimeFunction;
import org.hibernate.query.criteria.internal.expression.function.CurrentTimestampFunction;
import org.springframework.data.auditing.CurrentDateTimeProvider;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
@Table(name="housing")
public class HousingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String description;
    private Double price;
    private Integer bedroom;

    @Column(name = "living_room")
    private Integer livingRoom;
    private Integer bathroom;

    @Column(name = "swimming_pool")
    private Integer swimmingPool;
    private Integer garage;
    private Integer cellar;
    private String images;

    @Column(name = "no_street")
    private Integer noStreet;

    @Column(name = "name_street")
    private String nameStreet;

    @Column(name = "postal_code")
    private String postalCode;
    private String city;
    private String about;
    private Timestamp publication;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Enumerated(EnumType.STRING)
    @Column(name = "garden")
    private Type garden;

    public HousingEntity(String description, double price, Integer bedroom, Integer livingRoom, Integer bathroom, Integer swimmingPool, Integer garage, Integer cellar, String images, Integer noStreet, String nameStreet, String postalCode, String city, String about, UserEntity user, Type garden) {
        this.description = description;
        this.price = price;
        this.bedroom = bedroom;
        this.livingRoom = livingRoom;
        this.bathroom = bathroom;
        this.swimmingPool = swimmingPool;
        this.garage = garage;
        this.cellar = cellar;
        this.images = images;
        this.noStreet = noStreet;
        this.nameStreet = nameStreet;
        this.postalCode = postalCode;
        this.city = city;
        this.about = about;
        this.user = user;
        this.garden = garden;
        this.publication = new Timestamp(System.currentTimeMillis());;

    }

    public enum Type {
        NO,YES
    }

    @Override
    public String toString() {
        return "HousingEntity{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", bedroom=" + bedroom +
                ", livingRoom=" + livingRoom +
                ", bathroom=" + bathroom +
                ", swimmingPool=" + swimmingPool +
                ", garage=" + garage +
                ", cellar=" + cellar +
                ", images='" + images + '\'' +
                ", noStreet=" + noStreet +
                ", nameStreet='" + nameStreet + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", about='" + about + '\'' +
                ", publication=" + publication +
                ", user=" + user +
                ", garden=" + garden +
                '}';
    }
}
