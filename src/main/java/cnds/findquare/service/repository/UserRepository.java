package cnds.findquare.service.repository;

import cnds.findquare.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    // find user by first name or last name
    @Query("select u from UserEntity u where u.lastName like %:name or u.firstName like %:name")
    List<UserEntity> findByName(@Param("name") String name);
    // find user by status
    List<UserEntity> findByStatus(UserEntity.Status status);
    // find user identity_status
    List<UserEntity> findByIdentityStatus(UserEntity.IdentityStatus identityStatus);

}
