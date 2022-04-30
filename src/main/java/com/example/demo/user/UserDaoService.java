package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "Kenneth", new Date()));
        users.add(new User(2, "Alice", new Date()));
        users.add(new User(3, "Elena", new Date()));
    }

    public List<User> finaAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id) {
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()) {
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public User updateById(int id, User updateUser) {
        for (User user : users) {
            if (user.getId() == id) {
                updateUser.setId(id);
                updateUser.setJoinDate(user.getJoinDate());

                users.set(users.indexOf(user), updateUser);
                return updateUser;
            }
        }
        return null;
    }
}
