package com.didispace.sercie.impl;

import com.didispace.Dao.UserRepository;
import com.didispace.model.User;
import com.didispace.sercie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceimpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public String addUser(User user) {return userRepository.save(user).toString(); }

    @Override
    public boolean findUserByString() {
        return false;
    }
}
