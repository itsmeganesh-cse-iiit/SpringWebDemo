package com.ganesh.springweb;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody
	public String home(HttpServletRequest req,HttpServletResponse res) {
		
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		session.setAttribute("name", name);
//		req.setAttribute("name", name);  // For temporary request response
		return "home";
		
	}

}
