package cnds.findquare.service;

import cnds.findquare.model.UserEntity;
import cnds.findquare.service.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<UserEntity> getUserById(final Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public List<UserEntity> findByStatus(UserEntity.Status status) {
        return userRepository.findByStatus(status);
    }

    @Override
    public List<UserEntity> findByIdentityStatus(UserEntity.IdentityStatus identityStatus) {
        return userRepository.findByIdentityStatus(identityStatus);
    }
}
