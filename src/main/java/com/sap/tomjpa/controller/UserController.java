package com.sap.tomjpa.controller;

import com.sap.tomjpa.model.UserRecord;
import com.sap.tomjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {
  @Autowired
  private UserService userService;
  @RequestMapping(path = "/users",method = RequestMethod.GET)
  public List<UserRecord> getAllUsers(){
    return userService.getAllUsers();
  }
  @RequestMapping(path = "/adduser",method = RequestMethod.POST)
  public UserRecord addUser(@RequestBody UserRecord userRecord){
    return userService.addUser(userRecord);
  }
}
