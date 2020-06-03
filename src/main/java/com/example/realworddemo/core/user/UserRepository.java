package com.example.realworddemo.core.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
    User findUserByEmailAndPassword(String email,String password);
    User findUserByUsername(String username);
    User findUserById(String id);
}
