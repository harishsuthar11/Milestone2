package com.example.milestone2.service;


import com.example.milestone2.model.User;
import com.example.milestone2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    private UserRepository userrepo;

    public List<User> getUsers(){
        return userrepo.findAll();

    }
}
