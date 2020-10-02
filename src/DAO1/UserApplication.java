package DAO1;

import java.util.Optional;

/**
 * perform CRUD using Dao pattern
 * - interface Dao abstractly define all CRUD methods
 * - bean class User
 * - connect both with UserDao implementing DAO and take referrence of User
 * - main class to implement the persistence task
 */

public class UserApplication {

    private static Dao<User> userDao;

    public static void main(String[] args) {
        userDao = new UserDao(); // access the database
        System.out.println("initial size is " + userDao.getListSize()); // originally has two

        User user1 = getUser(0);
        System.out.println(user1 + " for user1.");
        userDao.update(user1, new String[]{"Jake", "jake@domain.com"});
        //userDao.update(user1, new String[]{"Nancy", "Nancy@domail.com"});
        userDao.delete(user1);
        System.out.println(userDao.getListSize() + " user left");

        userDao.save(new User("Julie", "julie@domain.com"));

        userDao.getAll().forEach(user -> System.out.println(user.getName() + " " + user.getEmail()));
    }

    private static User getUser(long id) {
        Optional<User> user = userDao.get(id);

        return user.orElseGet(
                () -> new User("non-existing user", "no-email"));
    }
}