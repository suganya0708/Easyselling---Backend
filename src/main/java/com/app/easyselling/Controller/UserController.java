package com.app.easyselling.Controller;
import com.app.easyselling.Model.User;
import com.app.easyselling.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService  userService;

    @GetMapping("/users")
    private List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/create_user")
    private User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

}
