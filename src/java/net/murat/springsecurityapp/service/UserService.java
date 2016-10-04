package net.murat.springsecurityapp.service;


import net.murat.springsecurityapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
