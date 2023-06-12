package com.example.exercise.service;

import com.example.exercise.model.User;
import com.example.exercise.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseService implements IUserService{

@Autowired
private IUserRepository repository;

    @Override
    public User save(User user) {
        repository.save(user);


        return user;
    }
}
