package advanced.generics;

import java.util.List;

public interface Service<T extends Entity, U> {
    List<T> findAll();

    T save(T entity);

    T findById(U id);
}
