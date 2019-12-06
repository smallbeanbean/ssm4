package com.dao;

import java.util.List;

import com.bean.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    //查找学生教师数据
    List<Student> stutea();
    //学生总条数
    int stucnt();
    //学生分页数据
    List<Student> fenye(int page,int size);
}