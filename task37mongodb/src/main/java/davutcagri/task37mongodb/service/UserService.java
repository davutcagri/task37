package davutcagri.task37mongodb.service;

import davutcagri.task37mongodb.model.User;
import davutcagri.task37mongodb.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UserService {

    private long userLimit = 5000;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save() {
        log.info("UserService save process started!");
        List<User> users = new ArrayList<User>();
        for (long i = 1; i <= userLimit; i++) {
            User user = new User();
            user.setName("user" + i);
            users.add(user);
        }
        userRepository.saveAll(users);
        log.info("UserService save process finished!");
    }

    @Cacheable("users")
    public void read() {
        log.info("UserService read process started!");
        userRepository.findAll();
        log.info("UserService read process finished!");
    }

    @CachePut("users")
    public void update() {
        log.info("UserService update process started!");
        List<User> usersInDB = userRepository.findAll();
        List<User> users = new ArrayList<User>();
        for (int i = 0; i < userLimit; i++) {
            User user = usersInDB.get(i);
            user.setName(i + "user");
            users.add(user);
        }
        userRepository.saveAll(users);
        log.info("UserService update process finished!");
    }

    @CacheEvict("users")
    public void delete() {
        log.info("UserService delete process started!");
        userRepository.deleteAll();
        log.info("UserService delete process finished!");
    }
}
