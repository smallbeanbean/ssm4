package com.dao;

import java.util.List;

import org.springframework.web.context.ContextLoaderListener;

import com.bean.Myuser;

public interface MyuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Myuser record);

    int insertSelective(Myuser record);

    Myuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Myuser record);

    int updateByPrimaryKey(Myuser record);
    //查询表中所有记录，显示在页面上
    List<Myuser> selectAllUser();
    List<Myuser> selectAllUser2();
   // ContextLoaderListener
    //分页方法,page 值为(当前页-1)*size
    List<Myuser> pageUser(int page,int size);
}