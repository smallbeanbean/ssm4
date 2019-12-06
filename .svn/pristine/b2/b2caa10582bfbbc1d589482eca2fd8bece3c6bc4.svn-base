package com.control;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;

import com.bean.Student;
import com.service.StudentService;

@Controller
@RequestMapping("stu.action")
public class StudentController {
	@Autowired
	StudentService stuService;
	@Resource
	Page<Student> stuPage;
	/**
	 * 查找学生教师信息
	 */
	@RequestMapping(params="select")
	public String stuTeaInfo(Model model){
		model.addAttribute("stutea", stuService.stutea());
		return "forward:/stutea.jsp";//直接进入根目录
	}
	/**
	 * 插入一条学生数据到表中
	 */
	@RequestMapping(params="insert")
	@ResponseBody
	public int stuInsert(Student record,HttpServletRequest req,MultipartFile spic2){
		//得到文件名
		String path=req.getServletContext().getRealPath("upload");
		String name=spic2.getOriginalFilename();
		try {
			spic2.transferTo(new File(path+"/"+name));
			//将name名注入bean中
			record.setSpic(name);
			//调用服务层插入数据
			return stuService.insert(record);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 将分页数据和总页数装入map中，再发送到页面
	 */
	@RequestMapping(params="fenye2")
	@ResponseBody
	public Page<Student> fenye(int page){
		stuPage.setPages(stuService.stucnt());//总页数
		stuPage.setFenyeData(stuService.fenye(page, 2));
		return stuPage;
	}
	/**
	 * 将对应的学生记录标志位修改为-1,返回一个json串
	 */
	@RequestMapping(params="delflag")
	@ResponseBody
	public int stuUpate(int sid,Student record){
		//注入学生id
		record.setSid(sid);
		//注入学生标志位
		record.setSflag(-1);
		return stuService.updateByPrimaryKeySelective(record);
	}

}
