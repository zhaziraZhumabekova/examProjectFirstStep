package company.dao;

import company.model.User;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> users = new ArrayList<>();

    public UserDao() {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "users=" + users +
                '}';
    }
}
