import company.dao.UserDao;
import company.model.User;
import company.servise.UserService;
import company.servise.impl.MyException;
import company.servise.impl.UserServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1, "Zhazira1", 11, "female");
        User user2 = new User(2, "Zhazira2", 22, "female");
        User user3 = new User(3, "Zhazira3", 33, "female");

        UserServiceImpl userimpl = new UserServiceImpl();
        userimpl.addUser(user1);
        userimpl.addUser(user2);
        userimpl.addUser(user3);

        try{
            System.out.println(userimpl.findById(1));
            userimpl.getAllUsers();
            userimpl.deleteById(2);
            userimpl.getAllUsers();

        } catch(MyException e){
            System.out.println(e.getMessage());
        }

    }
}