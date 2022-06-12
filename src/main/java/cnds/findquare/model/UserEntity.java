package cnds.findquare.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    private Integer avis;
    private String comment;
    private String phone;
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "identity_status")
    private IdentityStatus identityStatus;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<HousingEntity> housings;

    public UserEntity(String firstName, String lastName, Integer avis, String comment, String phone, String email, IdentityStatus identityStatus, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avis = avis;
        this.comment = comment;
        this.phone = phone;
        this.email = email;
        this.identityStatus = identityStatus;
        this.status = status;
    }

    public enum Status {
        PARTICULAR, PROFESSIONAL
    }

    public enum IdentityStatus {
        NOT_VERIFY,VERIFY
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avis=" + avis +
                ", comment='" + comment + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", identityStatus=" + identityStatus +
                ", status=" + status +
                '}';
    }
}
