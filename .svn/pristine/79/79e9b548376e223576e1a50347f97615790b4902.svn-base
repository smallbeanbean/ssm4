package com.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Myuser;
import com.dao.MyuserMapper;
import com.service.MyuserService;

@Service("user")
public class MyuserServiceI implements MyuserService{
	//接口成员
	@Resource
	MyuserMapper userMapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(id);//调用
	}

	@Override
	public int insert(Myuser record) {
		// TODO Auto-generated method stub
		return userMapper.insert(record);
	}

	@Override
	public int insertSelective(Myuser record) {
		// TODO Auto-generated method stub
		return userMapper.insertSelective(record);
	}

	@Override
	public Myuser selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Myuser record) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Myuser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Myuser> selectAllUser() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser();
	}

	@Override
	public List<Myuser> selectAllUser2() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUser2();
	}

	@Override
	public List<Myuser> pageUser(int page, int size) {
		// TODO Auto-generated method stub
		return userMapper.pageUser((page-1)*size, size);
	}

}
