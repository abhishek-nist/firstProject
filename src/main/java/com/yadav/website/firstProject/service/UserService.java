package com.yadav.website.firstProject.service;

import com.yadav.website.firstProject.entity.User;
import java.util.List;

public interface UserService {
    List<User> getUsers();
    User saveUser(User user);
}
