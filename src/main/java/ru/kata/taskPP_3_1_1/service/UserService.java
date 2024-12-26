package ru.kata.taskPP_3_1_1.service;


import ru.kata.taskPP_3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> showAll();

    void save(User user);

    void delete(long id);

    void update(User user, long id);

    User getById(long id);
}
