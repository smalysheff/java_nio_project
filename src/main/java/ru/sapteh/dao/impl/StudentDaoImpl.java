package ru.sapteh.dao.impl;

import ru.sapteh.config.IOConfig;
import ru.sapteh.dao.StudentDao;
import ru.sapteh.model.Student;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private final IOConfig config;

    public StudentDaoImpl() {
        this.config = new IOConfig();
    }

    @Override
    public Student findById(Integer key) {
        return null;
    }

    @Override
    public List<String> findAll() {
        return config.readFromFile();
    }

    @Override
    public int save(Student entity) {
        config.writeToFile(entity.toString());
        return entity.getId();
    }

    @Override
    public int update(Student entity, Integer key) {
        return 0;
    }

    @Override
    public int delete(Integer key) {
        return 0;
    }
}
