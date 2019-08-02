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
		
		//����ģ���������ڴ��ݵ�jsp
		mav.addObject("msg", "hello springmvc...");
		
		//������ͼ���֣�������Ӧ�û�
		//mav.setViewName("/WEB-INF/jsp/hello.jsp");
		mav.setViewName("hello");
		return mav;
	}
}
