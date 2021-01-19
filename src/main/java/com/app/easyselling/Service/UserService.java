package com.app.easyselling.Service;

import com.app.easyselling.Model.User;
import com.app.easyselling.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List< User> getAllUsers() {
        List <User> userList = new ArrayList <User> ();
        userRepository.findAll().forEach (users -> userList.add (users));
        return userList;
    }

    public User createUser(User user) {
        return userRepository.save (user);

    }
}
