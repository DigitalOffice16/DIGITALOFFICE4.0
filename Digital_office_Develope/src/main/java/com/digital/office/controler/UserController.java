package com.digital.office.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.digital.office.model.dao.User;
import com.digital.office.model.dto.OfficeUserDto;
import com.digital.office.service.UserServiceImpl;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

 
    @RequestMapping(value="get-alluser",method = RequestMethod.GET)
    public List<User> listUser(){
        return userService.findAll();
    }



    @RequestMapping(value="/signup", method = RequestMethod.POST)
    public User saveUser(@RequestBody OfficeUserDto user){
        return userService.save(user);
    }



}
