package spring.bootstrap.dao;

import spring.bootstrap.entities.User;

import java.util.List;

public interface UserDAO {

    List<User> allUser();
    void addUser(User user);
    User getUserById(long id);
    void updateUser(User user);
    void removeUserById(long id);
    User getUserByNickname(String nickname);

}
