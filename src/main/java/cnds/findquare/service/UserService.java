package cnds.findquare.service;

import cnds.findquare.model.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    // find User by id
    Optional<UserEntity> getUserById(final Integer id);
    // find all Users
    List<UserEntity> getAllUser();
    // Delete User
    void deleteUserById(final Integer id);
    // create new User
    UserEntity createUser(UserEntity userEntity);
    // find user by first name or last name
    @Query("select u from UserEntity u where u.lastName like %:name or u.firstName %:name orderBy name")
    List<UserEntity> findByName(@Param("name") String name);
    // find user by status
    List<UserEntity> findByStatus(UserEntity.Status status);
    // find user identity_status
    List<UserEntity> findByIdentityStatus(UserEntity.IdentityStatus identityStatus);
}
