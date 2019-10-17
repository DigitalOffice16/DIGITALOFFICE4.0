package com.edigital.office.service;

import org.springframework.stereotype.Service;

import com.edigital.office.model.dao.User;
@Service
public interface UserService {
    public User getUser(String userName);
}
