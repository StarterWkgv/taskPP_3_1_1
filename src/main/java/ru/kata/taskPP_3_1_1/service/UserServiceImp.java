package ru.kata.taskPP_3_1_1.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.taskPP_3_1_1.dao.UserDao;
import ru.kata.taskPP_3_1_1.model.User;

import java.util.List;

@Service
@Transactional()
public class UserServiceImp implements UserService {
    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> showAll() {
        return userDao.showAll();
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void delete(long id) {
        userDao.delete(id);
    }

    @Override
    public void update(User user, long id) {
        userDao.update(user, id);
    }

    @Transactional(readOnly = true)
    @Override
    public User getById(long id) {
        return userDao.getById(id);
    }
}
