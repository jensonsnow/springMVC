package com.hui.springmvc.demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpringMvc {
	
	@RequestMapping("hello")
	public ModelAndView hello() {
		System.out.println("hello springmvc ...");
		ModelAndView mav = new ModelAndView();
		
		//设置模型数据用于传递到jsp
		mav.addObject("msg", "hello springmvc...");
		
		//设置试图名字，用于响应用户
		//mav.setViewName("/WEB-INF/jsp/hello.jsp");
		mav.setViewName("hello");
		return mav;
	}
}
