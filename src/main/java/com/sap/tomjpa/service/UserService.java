package com.sap.tomjpa.service;

import com.sap.tomjpa.model.UserRecord;
import com.sap.tomjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;
  public List<UserRecord> getAllUsers(){
    List<UserRecord>userRecords=new ArrayList<>();
    userRepository.findAll().forEach(userRecords::add);
    return userRecords;

  }
  public UserRecord addUser(UserRecord userRecord){
    userRepository.save(userRecord);
    return userRecord;
  }
}
