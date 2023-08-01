package com.example.training.service;

import com.example.training.domain.User;

import java.util.List;

public interface UserService {

    User findByAccount(String account);

    List<User> findAll();

    void clear(String account);
}
