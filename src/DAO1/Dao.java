package DAO1;

import java.util.List;
import java.util.Optional;

/**
 * Basic Dao layer - keep the domain model completely
 * decoupled from the persistence layer.
 * purpose: defines an abstract API that performs CRUD
 * operations on objects of type T.
 * @param <T>
 */

public interface Dao<T> {
    Optional<T> get(long id);

    List<T> getAll();

    void save(T t);

    void update(T t, String[] params);

    void delete(T t);

    int getListSize();
}
