package net.java.springboot.service;

import net.java.springboot.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(long userId);
}
