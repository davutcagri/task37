package davutcagri.task37mongodb.controller;

import davutcagri.task37mongodb.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public void save() {
        userService.save();
    }

    @GetMapping("/read")
    public void read() {
        userService.read();
    }

    @PutMapping("/update")
    public void update() {
        userService.update();
    }

    @DeleteMapping("/delete")
    public void delete() {
        userService.delete();
    }

}
