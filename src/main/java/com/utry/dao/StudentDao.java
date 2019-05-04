package com.utry.dao;

import com.utry.entity.StudentEntity;

import java.util.List;

/**
 * Created by w1277006781 on 2018/7/22.
 */
public interface StudentDao {

    List<StudentEntity> queryAll();

    Integer insert(StudentEntity student);
}
