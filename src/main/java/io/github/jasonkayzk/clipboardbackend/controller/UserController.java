package io.github.jasonkayzk.clipboardbackend.controller;

import io.github.jasonkayzk.clipboardbackend.dao.UserDao;
import io.github.jasonkayzk.clipboardbackend.entity.User;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/user")
    public Object getUser(@RequestParam Long id) {
        Optional<User> opt = userDao.findById(id);
        // 存在返回的User对象, 不存在返回null
        return opt.orElse(null);
    }

    @PostMapping("/user")
    public String addUser(@RequestParam Long id, @RequestParam String email,
                          @RequestParam String salt, @RequestParam String creator) {
        Long now = System.currentTimeMillis();
        userDao.save(new User(id, email, salt, creator, now));
        return "ok";
    }

    @PutMapping("/user")
    public String updateUser(@RequestParam Long id, @RequestParam String email,
                             @RequestParam String salt, @RequestParam String creator) {
        Long now = System.currentTimeMillis();
        userDao.save(new User(id, email, salt, creator, now));
        return "ok";
    }

    @DeleteMapping("/user")
    public String deleteUser(@RequestParam Long id) {
        userDao.deleteById(id);
        return "ok";
    }

}
