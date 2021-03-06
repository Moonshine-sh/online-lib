package by.ginel.lib.dao.api;

import by.ginel.lib.dao.entity.AbstractEntity;

import java.util.List;

public interface Dao<T extends AbstractEntity> {
    void save(T entity);

    void delete(Long id);

    void update(T newEntity);

    T getById(Long id);

    List<T> getAll();

}
