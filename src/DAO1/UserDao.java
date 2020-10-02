package DAO1;

import Data_Access_Object_DAO_Pattern.FileReading;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * UserDao hides from the application all the low-level details on
 * how the objects are persisted, updated, and deleted.
 */

public class UserDao implements Dao<User> {
    // connect to user database and define all the method of CRUD
    private List<User> users = new ArrayList<>();
    private List<String[]> obj;

    public UserDao() {
        obj = new FileReading("C:\\Users\\NancyPC\\Desktop\\Design_Pattern_Java\\src\\StudentDataFile").readFile();
        for (int i = 0; i <obj.size() ; i++) {
            User theUser = new User((obj.get(i))[0], (obj.get(i))[3]);
            users.add(theUser);
        }
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(users.get((int) id));
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user, String[] params) {
        if(users.contains(user)) {
            int index = users.indexOf(user);
            users.get(index).setName(Objects.requireNonNull(
                    params[0], "Name cannot be null"));
            users.get(index).setEmail(Objects.requireNonNull(
                    params[1], "Email cannot be null"));
        }
        else {
            users.add(users.size(),new User(params[0], params[1]));
        }



    }

    @Override
    public void delete(User user) {
        users.remove(user);
        System.out.println("list size " + getListSize());
    }

    @Override
    public int getListSize() {
        return users.size();

    }
}