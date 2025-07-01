package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    List<User> users = new ArrayList<>();

    public User saveUser(User user) {
        users.add(user);
        return user;
    }

    public User getUserById(int userId) {
        for (User u1 : users) {
            if (u1.getUserId() == userId) {
                return u1;
            }
        }
        return null;
    }

    public User updateUser(int userId, User user) {
        for (User u1 : users) {
            if (u1.getUserId() == userId) {
                u1.setName(user.getName());
                users.add(u1);
                return u1;
            }
        }
        return null;
    }

    public void deleteUser(int userId) {
        users.remove(userId);
    }
}
