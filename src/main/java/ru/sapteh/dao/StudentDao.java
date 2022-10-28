package ru.sapteh.dao;

import ru.sapteh.model.Student;

import java.util.List;

public interface StudentDao extends BaseDao<Student, Integer> {
    @Override
    Student findById(Integer key);

    @Override
    List<String> findAll();

    @Override
    int save(Student entity);

    @Override
    int update(Student entity, Integer key);

    @Override
    int delete(Integer key);
}
