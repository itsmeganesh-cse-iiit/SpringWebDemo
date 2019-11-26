package com.ganesh.springweb;

import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
//	@ResponseBody
//	public ModelAndView home(@RequestParam("name") String testname,HttpSession session) { // will give us the request object
//	public ModelAndView home(@RequestParam("name") String testname) {

		public ModelAndView home(Employee employee) {

			ModelAndView mv = new ModelAndView();
			mv.addObject("obj",employee); // we can add multiple objects
			mv.setViewName("home");
			
			return mv;
			
		}
	
	
	 // ###################### Noraml way
	//	public String home(HttpServletRequest req,HttpServletResponse res) {
	//		
	//		HttpSession session = req.getSession();
	//		String name = req.getParameter("name");
	//		session.setAttribute("name", name);
	////		req.setAttribute("name", name);  // For temporary request response
	//		return "home";
	//		
	//	}

}
