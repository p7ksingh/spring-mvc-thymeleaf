package com.pankaj.www.springmvcex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    List<User> users = new ArrayList<User>();
    

    public void saveUser(User user) {
        users.add(user);
    }


    public List<User> getUsers() {

        return users;
    }
}
