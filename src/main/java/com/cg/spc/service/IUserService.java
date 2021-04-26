package com.cg.spc.service;

import com.cg.spc.entities.User;

public interface IUserService {
public  User addNewUser(User user);
public User signIn(User user);
public User signOut(User user);
}
