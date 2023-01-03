/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.andimuhriffal.user.service.service;

import com.andimuhriffal.user.service.dto.User;
import java.util.List;

/**
 *
 * @author Acer
 */
public interface UserService {

    public List<User> getAlluser();

    public User getUser(String id);

    public void addUser(User user);

    public User updateUser(User user);

    public User deleteUser(String id);

   

  

  
    
}
