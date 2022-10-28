package ru.sapteh.dao;

import java.util.List;

public interface BaseDao<E, K> {
    E findById(K key);
    List<String> findAll();
    int save(E entity);
    int update(E entity, K key);
    int delete(K key);
}
