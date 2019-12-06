package com.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.TeacherService;

@Controller
@RequestMapping("tea.action")
public class TeacherController {
	@Autowired
	TeacherService teaService;
	/**
	 * 查找教师学生信息显示在页面
	 */
	@RequestMapping(params="select")
	public String teaStuInfo(Model model){
		model.addAttribute("teastu", teaService.teastu());
		return "forward:/teastu.jsp";//返回到根目录下的teastu.jsp
	}

}
