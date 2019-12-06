package com.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Myuser;
import com.service.MyuserService;

@Controller
@RequestMapping("/user")
public class MyuserController {
	//成员属性
	@Autowired
	MyuserService userService;
	/**
	 * 查找一条记录,返回一个bean
	 */
	@RequestMapping("/one")
	public String getOne(int id,Model model,HttpServletRequest req,HttpServletResponse rsp,HttpSession sess){
		//调用服务层的方法得到一条bean
		Myuser userBean=userService.selectByPrimaryKey(id);
		//将数据放入模型
		model.addAttribute("user", userBean);
		ModelAndView a=new ModelAndView();
		a.addObject("名", "保存的对象");
		Cookie cook=new Cookie("aa", "bb");
		//cook.setd
		//返回页面
		//return "forward:/aa.jsp";
		return "user";//user.jsp
	}
	/**
	 * 查询所有数据显示在页面
	 */
	@RequestMapping(params="all")
	@ResponseBody
	public List<Myuser> getAll(){
		return userService.selectAllUser2();
	}
	/**
	 * 删除一条语句
	 */
	@RequestMapping(params="del")
	@ResponseBody
	public int deleteUser(int id){
		//调用服务层的方法
		return userService.deleteByPrimaryKey(id);
	}
	/**
	 * 根据id查询一条数据返回到表单中
	 */
	@RequestMapping(params="oneuser")
	@ResponseBody
	public Myuser getOne(int id){
		return userService.selectByPrimaryKey(id);
	}
	/**
	 * 修改一条数据,Myuser数据与页面name一致
	 */
	@RequestMapping(params="oneupdate")
	@ResponseBody
	public int updateUser(Myuser record){
		return userService.updateByPrimaryKeySelective(record);
	}
	/**
	 * 插入表单数据到表中
	 */
	@RequestMapping(params="insert")
	@ResponseBody
	public int insertUser(Myuser record){
		return userService.insert(record);
	}
	/**
	 * 根据当前页及页面长度得到分页数据,形参为当前页
	 */
	@RequestMapping(params="page2")
	@ResponseBody
	public Map<String, Object>pageUser(int page){
		//计算总页数
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pages", 3);
		map.put("pagedata",userService.pageUser(page, 2));
		return map;
	}

}
