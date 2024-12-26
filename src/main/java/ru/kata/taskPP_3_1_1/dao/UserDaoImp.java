package ru.kata.taskPP_3_1_1.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.kata.taskPP_3_1_1.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> showAll() {
        return entityManager.createQuery("select  u from User u", User.class).getResultList();
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    public void update(User user, long id) {
        User u = entityManager.find(User.class, id);
        u.setFirstName(user.getFirstName());
        u.setLastName(user.getLastName());
        u.setAge(user.getAge());
        u.setEmail(user.getEmail());
    }

    @Override
    public User getById(long id) {
        return entityManager.find(User.class, id);
    }
}
