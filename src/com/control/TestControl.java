package com.control;

import java.io.PrintWriter;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bean.Myuser;

@Controller
@RequestMapping("test")
@SessionAttributes(value = "usersession")
public class TestControl {
	@ModelAttribute(value = "mydata")
	public Myuser setData() {
		Myuser data = new Myuser();
		data.setUsername("hello");
		data.setUserpass("123");
		System.out.println(data);
		return data;
	}

	@ModelAttribute
	public void setData(Map<String, Object> mymap) {
		Myuser data = new Myuser();
		data.setUsername("hello2");
		data.setUserpass("456");
		System.out.println(data);
		mymap.put("user", data);
	}

	@RequestMapping("/myput3")
	public void dataOutPut3(PrintWriter out, @ModelAttribute("user") Myuser my) {
		out.print(my);
	}

	@RequestMapping("/myput")
	public void dataOutPut(PrintWriter out, @ModelAttribute("mydata") Myuser my) {
		out.print(my);
	}

	@RequestMapping("/myput2")
	public String dataOutPut2(Model m, @ModelAttribute("mydata") Myuser my) {
		m.addAttribute("data", my);
		return "test";
	}

	@RequestMapping("/myput4")
	public void dataOutPut4(@ModelAttribute("mydata") Myuser my,
			Map<String, Object> m, PrintWriter out) {
		m.put("usersession", my);
		out.print(m.get("user"));

	}

}
