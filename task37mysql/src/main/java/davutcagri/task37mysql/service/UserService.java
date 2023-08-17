package davutcagri.task37mysql.service;

import davutcagri.task37mysql.model.User;
import davutcagri.task37mysql.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
        for (long i = 1; i <= userLimit; i++) {
            User user = new User();
            user.setName("user" + i);
            userRepository.save(user);
        }
        log.info("UserService save process finished!");
    }

    public void read() {
        log.info("UserService read process started!");
        userRepository.findAll();
        log.info("UserService read process finished!");
    }

    public void update() {
        log.info("UserService update process started!");
        for (long i = 1; i <= userLimit; i++) {
            User user = userRepository.findById(i).get();
            user.setName(i + "user");
            userRepository.save(user);
        }
        log.info("UserService update process finished!");
    }

    public void delete() {
        log.info("UserService delete process started!");
        userRepository.deleteAll();
        log.info("UserService delete process finished!");
    }
}
