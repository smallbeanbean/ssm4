package com.service.imp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bean.Student;
import com.control.Page;
import com.dao.StudentMapper;
import com.service.StudentService;

@Service
@Transactional
public class StudentServiceI implements StudentService{
	@Resource
    StudentMapper stuMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * 当方法中出现运行时异常，则回滚;如果是检查型异常checked，需要人为设置rollbackFor,同时在方法中抛出异常
	 */
	@Override
	@Transactional
	public int insert(Student record) throws FileNotFoundException{
		// TODO Auto-generated method stub
		//开启事务
		int a=stuMapper.insert(record);
		System.out.println(1/0);
		
		/*try {
			FileInputStream file=new FileInputStream(new File("aa.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}*/
		//提交或回滚事务
		return a;
	}

	@Override
	public int insertSelective(Student record) {
		// TODO Auto-generated method stub
		return stuMapper.insertSelective(record);
	}

	@Override
	@Transactional(readOnly=true)
	public Student selectByPrimaryKey(Integer sid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Student record) {
		// TODO Auto-generated method stub
		return stuMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Student record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> stutea() {
		// TODO Auto-generated method stub
		return stuMapper.stutea();
	}

	@Override
	public int stucnt() {
		// TODO Auto-generated method stub
		int cnt=stuMapper.stucnt();
		int size=2;
		//总页数
		int pages=cnt%size==0?cnt/size:(int)(cnt/size)+1;
		return pages;//返回总页数
	}

	@Override
	public List<Student> fenye(int page, int size) {
		// TODO Auto-generated method stub
		return stuMapper.fenye((page-1)*size, size);
	}
	

}
