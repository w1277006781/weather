package com.utry.service;

import com.utry.entity.StudentEntity;

import java.util.List;

/**
 * Created by w1277006781 on 2018/7/22.
 */
public interface StudentService {

    List<StudentEntity> queryAll();

    Integer insert(StudentEntity student);
}
