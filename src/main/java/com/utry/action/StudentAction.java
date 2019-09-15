package com.utry.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.utry.entity.StudentEntity;
import com.utry.service.StudentService;

import java.util.List;

/**
 * Created by w1277006781 on 2018/7/22.
 */
public class StudentAction extends ActionSupport {
    private StudentService studentService;
    private List<StudentEntity> students;
    private StudentEntity student;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentEntity getStudent() {
	System.out.println("-----------wUUuww--------");
return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public String queryAll(){
        students = studentService.queryAll();
        return Action.SUCCESS;
    }

    public String  insert( ){
        studentService.insert(student);
        return Action.SUCCESS;
    }
}
