package com.eddperpich.augury.dao;

import java.util.List;

public interface GenericDao<T> {
    List<T> findAll();

    T findOne(Integer id);

    T save(T t );

    void delete(Integer id);

    void delete(T t);

    void deleteAll(List<T> list);
}
