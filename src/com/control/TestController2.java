package com.control;

import java.io.PrintWriter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test2")
public class TestController2 {

	@RequestMapping("/myput3")
	public void dataOutPut2(HttpSession session, PrintWriter out) {
		out.print(session.getAttribute("usersession"));

	}
}
