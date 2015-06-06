package com.kot32.warmenglish.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kot32.warmenglish.domain.Student;
import com.kot32.warmenglish.service.APPService;

@Controller
@RequestMapping("/app")
public class APPController {
	@Autowired
	APPService service;

	// 注册
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register(String username, String password) {
		System.out.println("接收到请求");		
		// 暂时不设置姓名，老师，班级等属性
		Student student = new Student();
		student.setUsername(username);
		student.setPassword(password);

		ModelAndView mv = new ModelAndView();
		try {
			if (service.register(student)) {
				mv.addObject("result", "success");
			} else {
				mv.addObject("result", "error");
			}
		} catch (Exception e) {
			mv.addObject("result", "error");
		}
		return mv;
	}
}
