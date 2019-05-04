package com.utry.serviceimp;

import com.utry.dao.StudentDao;
import com.utry.entity.StudentEntity;
import com.utry.service.StudentService;

import java.util.List;

/**
 * Created by w1277006781 on 2018/7/22.
 */
public class StudentServiceImp implements StudentService {
    private StudentDao studentDao;

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public List<StudentEntity> queryAll() {
        return studentDao.queryAll();
    }

    @Override
    public Integer insert(StudentEntity student) {
        return studentDao.insert(student);
    }
}
