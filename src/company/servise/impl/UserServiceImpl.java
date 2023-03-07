package company.servise.impl;

import company.dao.UserDao;
import company.model.User;
import company.servise.UserService;

import java.util.ArrayList;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.getUsers().add(user);
    }

    @Override
    public User findById(int id) {
        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                return user;
            }
        }
        throw new RuntimeException(" not found");
    }


    @Override
    public void deleteById(int id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                userDao.getUsers().remove(userDao.getUsers().get(i));
            }
        }
    }


    @Override
    public void getAllUsers() {
        for (User user : userDao.getUsers()) {
            System.out.println(user);
        }
    }

}
