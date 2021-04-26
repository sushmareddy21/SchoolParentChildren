package com.cg.spc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spc.entities.User;
@Repository
public interface IUserRepository extends JpaRepository<User,String>
{
//public  User addNewUser(User user);
//public User signIn(User user);
//public User signOut(User user);
}
